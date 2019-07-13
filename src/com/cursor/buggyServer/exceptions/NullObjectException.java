package com.cursor.buggyServer.exceptions;

public class NullObjectException extends Exception {

    public NullObjectException() {
        super("Oops, your object is null");
    }
}
