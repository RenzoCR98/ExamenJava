package com.codigo.examen.ports;

import com.codigo.examen.dto.UsuarioDTO;
import com.codigo.examen.request.RequestUsuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UsuarioServiceOut {
    UsuarioDTO createUsuarioOut(RequestUsuario requestUsuario);
    Optional<UsuarioDTO> getUsuarioOut(Long id);
    UsuarioDTO updateOut(Long id, RequestUsuario requestUsuario);
    UsuarioDTO deleteOut(Long id);
    UserDetailsService userDetailsService();
}
