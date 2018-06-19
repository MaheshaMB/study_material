<html>
<body>
	<h2>JAX-RS / Jersey RESTful example for Parameters ...</h2>
	<h2>====================================================</h2>

	<p>In JAX-RS are 5 types of parameters...</p>
	<p></p>
	<p>
		1. @PathParam [Normal URI Matching]: You can use @Path to bind URI
		pattern to a Java method. <br>Example => /api/messages/.../
	</p>
	<p>
		2. @PathParam [URI Matching with Single Parameter]: The value within
		an open brace { and close brace }, is represents a parameter, and can
		be access with @PathParam. pattern to a Java method. <br>Example
		=> /api/messages/{messageId}
	</p>
	<p>
		3. @PathParam [URI Matching with Multiple Parameter]: The value within
		an open brace { and close brace }, is represents a parameter, and can
		be access with @PathParam. pattern to a Java method. <br>Example
		=> /api/messages/{messageId}
	</p>
	<p>
		4. @PathParam [URI Matching and Regular Expression]: @Path support
		complex URI matching with regular expression, via following expression
		: {" variable-name [ ":" regular-expression ] "} . <br>Example =>
		@Path("{id : \\d+}") //support digit only <br>Example =>
		@Path("/username/{username : [a-zA-Z][a-zA-Z_0-9]}")
	</p>

	<p></p>

	<p>
		5. @QueryParam [Normal Query param]: you can use @QueryParam
		annotation to inject URI query parameter into Java method. <br>Example
		=> /api/books=start=1&offset=2
	</p>

	<p>
		6. @QueryParam [Programmatic Query Parameter]: Alternatively, you can
		get the query parameters grammatically, via '@Context UriInfo'. <br>Example
		=> /api/books=start=1&offset=2
	</p>

	<p>
		7. @QueryParam [@DefaultValue example]: @DefaultValue is good for
		optional parameter. <br>Example => /api/books=start=1&offset=2
	</p>

	<p></p>

</body>
</html>
