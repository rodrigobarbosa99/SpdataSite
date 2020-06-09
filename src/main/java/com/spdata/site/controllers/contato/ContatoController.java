package com.spdata.site.controllers.contato;

import org.springframework.http.ResponseEntity;

import com.spdata.site.dtos.contato.ContatoRequestDto;
import com.spdata.site.dtos.contato.ContatoResponseDto;

public interface ContatoController {
	
	public ResponseEntity<ContatoResponseDto> persist(ContatoRequestDto question);

}
