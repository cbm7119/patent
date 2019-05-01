package com.patent.patent.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "fail login")
public class LoginFailException extends RuntimeException {
    public LoginFailException(String message) {
        super(message);
    }
}
