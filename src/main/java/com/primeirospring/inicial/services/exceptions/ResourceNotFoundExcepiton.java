package com.primeirospring.inicial.services.exceptions;

public class ResourceNotFoundExcepiton extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundExcepiton(Object id) {
        super("Resource not found. Id " + id);
    }
}
