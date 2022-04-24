package com.lanple.lanple.presenter.rest.api.entities;

import lombok.Value;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Value
public class SignUpRequest {


    @NotNull
    @Size(min = 4)
    String name;

    @NotNull
    @Email
    String email;

    @NotNull
    @Size(min = 6)
    String password;
}
