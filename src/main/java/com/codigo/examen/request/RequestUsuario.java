package com.codigo.examen.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RequestUsuario {
    private String username;
    private String password;
}
