package com.lanple.lanple.presenter.rest.api.entities;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ApiResponse {
    Boolean success;
    String message;
}
