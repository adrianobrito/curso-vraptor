package com.adrianobrito.curso.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Options;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Controller
public class OptionsController {
	
	@Inject private Result result;
	
	@Options("/*")
	public void options(){
		result.use(Results.status()).noContent();
	}
	
}
