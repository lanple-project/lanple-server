package com.lanple.lanple.presenter.rest.api.user;

import com.lanple.lanple.presenter.rest.api.entities.ApiResponse;
import com.lanple.lanple.presenter.rest.api.entities.SignUpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/User")
public interface UserResource {

    @PostMapping
    ResponseEntity<ApiResponse> signUp(@Valid @RequestBody SignUpRequest signUpRequest);
}
