package com.codigo.examen.controller;

import com.codigo.examen.entity.Usuario;
import com.codigo.examen.request.SignInRequest;
import com.codigo.examen.request.SignUpRequest;
import com.codigo.examen.response.AuthenticationResponse;
import com.codigo.examen.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms-examen/v1/autentication")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<Usuario> signUp(@RequestBody SignUpRequest signUpRequest){
        return ResponseEntity.ok(authenticationService.signUp(signUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<AuthenticationResponse> signin(@RequestBody SignInRequest signInRequest){
        return ResponseEntity.ok(authenticationService.signin(signInRequest));
    }
}
