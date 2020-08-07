package com.spdata.integration;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.RequestBuilder;

import com.spdata.site.dtos.contato.ContatoRequestDto;

@TestMethodOrder(OrderAnnotation.class)
public class ContatoTeste extends BaseIT {
	
	static ContatoRequestDto newContact()
	{
		ContatoRequestDto contato = new ContatoRequestDto();
		
		contato.setCargo("Diretor");
		contato.setCidade("BH");
		contato.setEmail("rodrigo@teste.com");
		contato.setEstado("MG");
		contato.setMensagem("Contato de teste");
		contato.setNome("Rodrigo");
		contato.setNomeEmpresa("SpData");
		contato.setTelefone("31 00499999");
		
		return contato;
	}
	
	@Test
	@DisplayName("Gravar um contato")
	@Order(1)
	void persist() throws Exception {
		
		RequestBuilder requestBuilder = post("/v1/contato")//
				.contentType(MediaType.APPLICATION_JSON)//
				.content(objectMapper.writeValueAsString(newContact()));

		MockHttpServletResponse response = mvc.perform(requestBuilder)//
				.andExpect(status().isOk())//
				.andReturn()//
				.getResponse();

		assertNotNull(response);

	}

}
