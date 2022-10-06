package controllers;

import models.Book;
import play.api.data.FormError;
import play.i18n.Messages;
import play.i18n.MessagesApi;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import java.util.Set;

import views.html.books.*;
import views.html.errors.*;

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
    public Result index(Http.Request request) {
        Set<Book> books = Book.allBooks();
        return ok(index.render(books, request));
    }

    //view a book detail
    public Result detail(Integer id, Http.Request request) {
        Book book = Book.findById(id);
        if (book == null) {
            return notFound(_404.render(request));
        }
        return ok(show.render(book, request));
    }

    //create a book
    public Result create(Http.Request request) {
        Form<Book> bookForm  = formFactory.form(Book.class);
        return ok(create.render(bookForm, request, messagesApi.preferred(request), ""));
    }

    //save a book
    public Result save(Http.Request request) {
        Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest(request);
        if (bookForm.hasErrors()){
            return badRequest(create.render(bookForm, request, messagesApi.preferred(request), "Please correct the form below"));
        }
        Book book = bookForm.get();
        Book.add(book);

        return redirect(routes.BooksController.index()).flashing("success", "Book Saved Successfully");
    }

    //edit a book
    public Result edit(Integer id, Http.Request request) {
        Book book = Book.findById(id);
        if (book == null) {
            return notFound(_404.render(request));
        }
        Form<Book> bookForm = formFactory.form(Book.class).fill(book);

        return ok(edit.render(bookForm, request, messagesApi.preferred(request), ""));
    }

    //update a book
    public Result update(Http.Request request) {
        Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest(request);
        if (bookForm.hasErrors()){
            return badRequest(edit.render(bookForm, request, messagesApi.preferred(request), "Please correct the form below"));
        }
        //get the old book from the form
        Book oldBook = formFactory.form(Book.class).bindFromRequest(request).get();
        //find the book that received from the form in the list and update its data
        Book updatedBook = Book.findById(oldBook.id);
        if (updatedBook == null) {
            return notFound(_404.render(request));
        }


        updatedBook.title = oldBook.title;
        updatedBook.price = oldBook.price;
        updatedBook.author = oldBook.author;

        return redirect(routes.BooksController.index()).flashing("success", "Book Saved Successfully");
    }

    //
    public Result delete(Integer id, Http.Request request) {
        Book book = Book.findById(id);
        if (book == null){
            return notFound(_404.render(request));
        }

        Book.remove(book);

        return redirect(routes.BooksController.index()).flashing("success", "Book Removed Successfully");
    }

}
