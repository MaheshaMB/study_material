package com.example.subresources.resources;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.example.subresources.beans.Book;
import com.example.subresources.service.BookService;
import com.example.subresources.service.BookServiceImpl;

@Path("/books")
// @Produces(MediaType.APPLICATION_JSON)
// @Consumes(MediaType.APPLICATION_JSON)
public class BookResources {

	private BookService bookService = new BookServiceImpl();

	@GET
	public List<Book> getBookResources() {
		return bookService.getAllBooks();
	}

	@POST
	public Book addBookResource(Book book) {
		return bookService.addBook(book);
	}

	@PUT
	@Path("/{bookName}")
	public Book updateBookResource(@PathParam("bookName") String name, Book book) {
		book.setName(name);
		return bookService.updateBook(book);
	}

	@DELETE
	@Path("/{bookName}")
	public Book deleteMessageResource(@PathParam("bookName") String name) {
		return bookService.deleteBook(name);
	}

	@GET
	@Path("/{bookName}")
	public Book addMessageResource(@PathParam("bookName") String name) {
		return bookService.getBook(name);
	}

	@Path("/{bookName}/authors")
	public AuthorResources getAuthorResource() {
		return new AuthorResources();
	}

}
