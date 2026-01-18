package com.tuananh.authenticate.controller;

import com.tuananh.authenticate.dto.request.ApiResponse;
import com.tuananh.authenticate.dto.request.AuthenticationRequest;
import com.tuananh.authenticate.dto.request.IntrospectRequest;
import com.tuananh.authenticate.dto.response.AuthenticationResponse;
import com.tuananh.authenticate.dto.response.IntrospectResponse;
import com.tuananh.authenticate.exception.AppException;
import com.tuananh.authenticate.service.AuthenticationService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthenticationController {
    AuthenticationService authenticationService;
    @PostMapping("/login")
    ApiResponse<AuthenticationResponse> login(@RequestBody AuthenticationRequest authenticationRequest) throws AppException {
        var res = authenticationService.authenticate(authenticationRequest);
        return ApiResponse.<AuthenticationResponse>builder()
                .result(res)
                .build();
    }
    @PostMapping("/introspect")
    ApiResponse<IntrospectResponse> introspect(@RequestBody IntrospectRequest introspectRequest) throws Exception {
        var res = authenticationService.introspect(introspectRequest);
        return ApiResponse.<IntrospectResponse>builder()
                .result(res)
                .build();
    }
}
