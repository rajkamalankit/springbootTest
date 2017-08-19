package com.crud.test.controller;

import org.hibernate.HibernateException;
import org.hibernate.JDBCException;
import org.hibernate.exception.SQLGrammarException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ControllerAdvice
class GlobalControllerExceptionHandler {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @ResponseStatus(HttpStatus.CONFLICT)  // 409
    @ExceptionHandler(DataIntegrityViolationException.class)
    public void handleConflict(DataIntegrityViolationException ex, HttpServletResponse response) throws IOException {
        log.error(ex.getCause().getMessage());
        response.sendError(HttpStatus.CONFLICT.value(), ex.getMessage());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    void handleBadRequests(IllegalArgumentException ex, HttpServletResponse response) throws IOException {
        log.error(ex.getMessage());
        response.sendError(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    void handleExceptions(Exception ex, HttpServletResponse response) throws IOException {
        log.error(ex.getCause().getMessage());
        response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value());
    }

    @ExceptionHandler({HibernateException.class, SQLGrammarException.class, JDBCException.class})
    void handleHibernateExceptions(Exception ex, HttpServletResponse response) throws IOException {
        log.error(ex.getCause().getMessage());
        response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value());
    }

}
