package com.solvd.homework4.exceptions;

public class InvalidItemException extends Exception {
    private static final long serialVersionUID = 1L;

    public String getMessage() {
        return "That item it's not in the catalog.";
    }
}
