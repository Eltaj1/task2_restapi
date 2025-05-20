package com.restapi.apifirst.product.support;

import com.restapi.apifirst.product.support.exception.notfound;
import com.restapi.apifirst.shared.api.response.ErrorMessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class productadvice {

    @ExceptionHandler(notfound.class)
    public ResponseEntity<ErrorMessageResponse> handleProductNotFoundException(notfound exception) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ErrorMessageResponse(exception.getMessage()));
    }
}