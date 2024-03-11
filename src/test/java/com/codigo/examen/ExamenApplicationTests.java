package com.codigo.examen;

import com.codigo.examen.adapters.UsuarioAdapterOther;
import com.codigo.examen.dto.UsuarioDTO;
import com.codigo.examen.entity.Usuario;
import com.codigo.examen.mapper.UsuarioMapper;
import com.codigo.examen.repository.RolRepository;
import com.codigo.examen.repository.UsuarioRepository;
import com.codigo.examen.request.RequestUsuario;
import com.codigo.examen.response.AuthenticationResponse;
import com.codigo.examen.response.ResponseUsuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.ReflectionTestUtils;

import java.sql.Timestamp;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@SpringBootTest
class ExamenApplicationTests {

	@Mock
	private UsuarioRepository usuarioRepository;
	@Mock
	private RolRepository rolRepository;
	@Mock
	private UsuarioMapper usuarioMapper;

	@InjectMocks
	private UsuarioAdapterOther usuarioAdapter;

	@BeforeEach
	void setUp(){
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void createUsuarioOutSuccess(){
		RequestUsuario requestPersona=new RequestUsuario("admin","poke12");
		UsuarioDTO personaDTOEsperada=new UsuarioDTO();
		//personaDTOEsperada.setIdPersona(1L);
		ReflectionTestUtils.setField(usuarioAdapter, "tokenApi","XXXXXXXXXX", String.class);


	private ResponseUsuario getResponseUsuario() {
		return new ResponseUsuario("admin","poke12","poke@gmail.com","997513543")
	}

}
