package com.MaciejPrzezwicki.DynamicShootingApp;

import com.MaciejPrzezwicki.DynamicShootingApp.exception.BindingResultSupport;
import com.MaciejPrzezwicki.DynamicShootingApp.exception.ResourceNotFoundException;
import com.MaciejPrzezwicki.DynamicShootingApp.model.ErrorDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationControllerAdvice {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationControllerAdvice.class);

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorDTO handle(ResourceNotFoundException ex) {
        return ErrorDTO.builder().message(ex.getMessage()).build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDTO handle(MethodArgumentNotValidException ex) {
        return ErrorDTO.builder().message(BindingResultSupport.asMessage(ex.getBindingResult())).build();
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorDTO handle(Exception ex) {
        LOGGER.warn("Something went wrong: {}", ex.getMessage(), ex);
        return ErrorDTO.builder().message("Something went wrong").build();
    }
}
