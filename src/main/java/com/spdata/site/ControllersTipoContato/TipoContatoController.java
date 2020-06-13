package com.spdata.site.ControllersTipoContato;

import org.springframework.http.ResponseEntity;

import com.spdata.site.dtosTipoContato.TipoContatoRequestDto;
import com.spdata.site.dtosTipoContato.TipoContatoResponseDto;

public interface TipoContatoController {
	
	public ResponseEntity<TipoContatoResponseDto> persist(TipoContatoRequestDto question);

}
