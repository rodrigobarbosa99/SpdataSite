package com.spdata.site.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spdata.site.dtosTipoContato.TipoContatoRequestDto;
import com.spdata.site.dtosTipoContato.TipoContatoResponseDto;
import com.spdata.site.entities.TipoContato;
import com.spdata.site.repositories.TipoContatoRepository;

@Service
public class TipoContatoService {
	@Autowired
	private TipoContatoRepository repository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public TipoContatoResponseDto persist(TipoContatoRequestDto requestDto) {

		TipoContato tipocontato = modelMapper.map(requestDto, TipoContato.class);
		tipocontato = repository.save(tipocontato);
		return modelMapper.map(tipocontato, TipoContatoResponseDto.class);
	}


}
