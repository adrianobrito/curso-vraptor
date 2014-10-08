package com.adrianobrito.curso;

import static br.com.caelum.vraptor.view.Results.http;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class NoticiasController {

	@Inject private Result result;
	
	@Get
	public void home(){
		result.use(http()).body("Hello world").setStatusCode(200);
	}
	
}