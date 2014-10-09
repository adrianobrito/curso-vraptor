package com.adrianobrito.curso;

import static br.com.caelum.vraptor.view.Results.http;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class NoticiasController {

	private final Result result;

	/**
	 * @deprecated CDI eyes only
	 */
	protected NoticiasController() {
		this(null);
	}
	
	@Inject
	public NoticiasController(Result result) {
		this.result = result;
	}
	
	@Get
	public void teste(){
		result.use(http()).body("Hello world").setStatusCode(200);
	}
	
}