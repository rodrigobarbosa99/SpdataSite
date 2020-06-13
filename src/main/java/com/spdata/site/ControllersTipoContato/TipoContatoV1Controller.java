package com.spdata.site.ControllersTipoContato;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.spdata.site.dtosTipoContato.TipoContatoRequestDto;
import com.spdata.site.dtosTipoContato.TipoContatoResponseDto;

import com.spdata.site.services.TipoContatoService;

@RestController
@RequestMapping(path = "/v1/tipocontato")
public class TipoContatoV1Controller implements TipoContatoController {

	@Autowired
	private TipoContatoService service;

	@Override
	@PostMapping
	public ResponseEntity<TipoContatoResponseDto> persist(@Valid @RequestBody TipoContatoRequestDto tipoContato) {
		return ResponseEntity.ok(service.persist(tipoContato));
	}
}



