package com.lanple.lanple.presenter.rest.api.user;

import com.lanple.lanple.presenter.rest.api.entities.ApiResponse;
import com.lanple.lanple.presenter.rest.api.entities.SignUpRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserController implements UserResource{
    @Override
    public ResponseEntity<ApiResponse> signUp(SignUpRequest signUpRequest) {
        //Executor . . .
        return ResponseEntity.ok(new ApiResponse(true,"test"));
    }
}
