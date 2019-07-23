package com.cursor.buggyServer.exceptions;

public class OddNumberException extends Exception {
    public OddNumberException(int i) {
        super("Oops, your number " + i + " is odd");
    }
}
