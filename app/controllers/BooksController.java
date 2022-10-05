package controllers;

import models.Book;
import play.i18n.MessagesApi;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import java.util.Set;

import views.html.books.*;

import javax.inject.*;

public class BooksController extends Controller{

    FormFactory formFactory;
    MessagesApi messagesApi;

    @Inject
    public BooksController(FormFactory formFactory, MessagesApi messagesApi) {
        this.formFactory = formFactory;
        this.messagesApi = messagesApi;
    }

    //view all books
    public Result index() {
        Set<Book> books = Book.allBooks();
        return ok(index.render(books));
    }

    //view a book detail
    public Result detail(Integer id) {
        Book book = Book.findById(id);
        if (book == null) {
            return notFound("Book Not Found").as("text/html");
        }
        return ok(show.render(book));
    }

    //create a book
    public Result create(Http.Request request) {
        Form<Book> bookForm  = formFactory.form(Book.class);
        return ok(create.render(bookForm, request, messagesApi.preferred(request)));
    }

    //save a book
    public Result save(Http.Request request) {
        Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest(request);
        Book book = bookForm.get();
        Book.add(book);

        return redirect(routes.BooksController.index());
    }

    //edit a book
    public Result edit(Integer id, Http.Request request) {
        Book book = Book.findById(id);
        if (book == null){
            return notFound("Book Not Found").as("text/html");
        }
        Form<Book> bookForm = formFactory.form(Book.class).fill(book);

        return ok(edit.render(bookForm, request, messagesApi.preferred(request)));
    }

    //update a book
    public Result update(Http.Request request) {

        //get the old book from the form
        Book oldBook = formFactory.form(Book.class).bindFromRequest(request).get();
        //find the book that received from the form in the list and update its data
        Book updatedBook = Book.findById(oldBook.id);
        if (oldBook == null) {
            return notFound("Book Not Found");
        }

        updatedBook.title = oldBook.title;
        updatedBook.price = oldBook.price;
        updatedBook.author = oldBook.author;

        return redirect(routes.BooksController.index());
    }

    //
    public Result delete(Integer id) {
        Book book = Book.findById(id);
        if (book == null){
            return notFound("Book Not Found");
        }

        Book.remove(book);

        return redirect(routes.BooksController.index());
    }

}
