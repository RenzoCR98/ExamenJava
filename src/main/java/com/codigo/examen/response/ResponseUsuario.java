package com.codigo.examen.response;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseUsuario {
    private Long idUsuario;
    private String username;
    private String password;
    private String email;
    private String telefono;

}
