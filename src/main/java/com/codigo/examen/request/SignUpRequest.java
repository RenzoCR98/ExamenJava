package com.codigo.examen.request;

import com.codigo.examen.entity.Rol;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;
import java.util.Set;

@Getter
@Setter
public class SignUpRequest {
    private String username;
    private String password;
    private String email;
    private String telefono;
    Set<Rol> Roles;
}
