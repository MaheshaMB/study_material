package com.example.jaxrs.resources;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.example.jaxrs.beans.Book;
import com.example.jaxrs.service.BookService;
import com.example.jaxrs.service.BookServiceImpl;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
public class ParameterResources {

	private BookService bookService = new BookServiceImpl();

	@GET
	public List<Book> getQueryParam(@DefaultValue("1") @QueryParam("start") int start,
			@QueryParam("offset") int offset) {
		if (start > 0 && offset > 0)
			return bookService.getBooksublist(start, offset);
		return bookService.getAllBooks();
	}

	@GET
	@Path("/context") // support digit only --- {bookName : [a-zA-Z][a-zA-Z_0-9]}
	public List<Book> getBookByYear(@Context UriInfo uriInfo) {
		int year = Integer.parseInt(uriInfo.getQueryParameters().getFirst("year"));
		if (year > 0){
			return bookService.getBooksByYear(year);
		}
		return bookService.getAllBooks();
	}

	@GET
	@Path("/technicalBooks")
	public List<Book> getTechnicalBooks() {
		return bookService.getTechnicalBooks();
	}

	@GET
	@Path("/{bookName}")
	public Book getBook(@PathParam("bookName") String bookName) {
		return bookService.getBook(bookName);
	}

	@GET
	@Path("/{bookType:[a-zA-Z][a-zA-Z_0-9]}/{year}")
	public List<Book> getBook(@PathParam("bookType") String bookType, @PathParam("year") int year) {
		return bookService.getBooksByYearNbookType(bookType, year);
	}

}
