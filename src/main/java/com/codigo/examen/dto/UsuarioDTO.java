package com.codigo.examen.dto;

import com.codigo.examen.entity.Rol;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private Long idUsuario;
    private String username;
    private String password;
    private String email;
    private String telefono;
    private boolean enabled;
    private boolean accountnonexpire;
    private boolean accountnonlocked;
    private boolean credentialsnonexpired;
}
