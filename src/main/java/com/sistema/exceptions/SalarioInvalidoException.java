package com.sistema.exceptions;

public class SalarioInvalidoException extends RuntimeException {
    public SalarioInvalidoException(String message) {
        super(message);
    }
}
