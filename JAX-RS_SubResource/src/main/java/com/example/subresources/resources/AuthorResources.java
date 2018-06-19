package com.example.subresources.resources;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.example.subresources.beans.Author;
import com.example.subresources.service.AuthorService;
import com.example.subresources.service.AuthorServiceImpl;

@Path("/")
public class AuthorResources {

	private AuthorService authorService = new AuthorServiceImpl();

	@GET
	public List<Author> getAllAuthors(@PathParam("bookName") String bookName) {
		return authorService.getAllAuthors(bookName);
	}

	@POST
	public Author addAuthors(@PathParam("bookName") String bookName, Author author) {
		return authorService.addAuthors(bookName, author);
	}

	@PUT
	@Path("/{authorId}")
	public Author updateAuthors(@PathParam("bookName") String bookName, @PathParam("authorId") long authorId,
			Author author) {
		author.setId(authorId);
		return authorService.updateAuthors(bookName, author);
	}

	@DELETE
	@Path("/{authorId}")
	public Author deleteAuthors(@PathParam("bookName") String bookName, @PathParam("authorId") long authorId) {
		return authorService.removeAuthors(bookName, authorId);
	}

	@GET
	@Path("/{authorId}")
	public Author getAuthors(@PathParam("bookName") String bookName, @PathParam("authorId") long authorId) {
		return authorService.getAuthors(bookName, authorId);
	}
}