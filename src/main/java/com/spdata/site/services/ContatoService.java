package com.spdata.site.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spdata.site.dtos.contato.ContatoRequestDto;
import com.spdata.site.dtos.contato.ContatoResponseDto;
import com.spdata.site.entities.Contato;
import com.spdata.site.repositories.ContatoRepository;

@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository repository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public ContatoResponseDto persist(ContatoRequestDto requestDto) {

		Contato contato = modelMapper.map(requestDto, Contato.class);
		contato = repository.save(contato);
		return modelMapper.map(contato, ContatoResponseDto.class);
	}

}
