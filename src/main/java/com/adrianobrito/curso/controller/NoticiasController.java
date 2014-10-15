package com.adrianobrito.curso.controller;

import static br.com.caelum.vraptor.view.Results.*;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;

import com.adrianobrito.curso.model.Noticia;
import com.adrianobrito.curso.service.NoticiaService;

@Controller
public class NoticiasController {

	@Inject private Result result;
	@Inject private NoticiaService noticiaService;
	
	@Post
	@Consumes("application/json")
	public void enviar(Noticia noticia){
		result.use(xml()).from(noticia).serialize();
	}
	
}