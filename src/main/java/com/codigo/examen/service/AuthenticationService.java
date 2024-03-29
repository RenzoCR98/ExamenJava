package com.codigo.examen.service;

import com.codigo.examen.entity.Usuario;
import com.codigo.examen.request.SignInRequest;
import com.codigo.examen.request.SignUpRequest;
import com.codigo.examen.response.AuthenticationResponse;

public interface AuthenticationService {
    Usuario signUp(SignUpRequest signUpRequest);
    AuthenticationResponse signin(SignInRequest signInRequest);
}
