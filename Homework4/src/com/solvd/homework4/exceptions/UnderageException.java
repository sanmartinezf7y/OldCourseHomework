package com.solvd.homework4.exceptions;

public class UnderageException extends Exception {
    private static final long serialVersionUID = 1L;

    public String getMessage() {
        return "Access denied - You must be at least 18 years old.";
    }
}
