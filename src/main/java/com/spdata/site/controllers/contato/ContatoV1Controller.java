package com.spdata.site.controllers.contato;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spdata.site.dtos.contato.ContatoRequestDto;
import com.spdata.site.dtos.contato.ContatoResponseDto;
import com.spdata.site.services.ContatoService;

@RestController
@RequestMapping(path = "/v1/contato")
public class ContatoV1Controller implements ContatoController{
	
	@Autowired
	private ContatoService service;

	@Override
	@PostMapping
	public ResponseEntity<ContatoResponseDto> persist(@Valid @RequestBody ContatoRequestDto contato) {
		return ResponseEntity.ok(service.persist(contato));
	}

}
