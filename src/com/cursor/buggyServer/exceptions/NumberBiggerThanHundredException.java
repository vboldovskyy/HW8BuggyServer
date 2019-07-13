package com.cursor.buggyServer.exceptions;

public class NumberBiggerThanHundredException extends Exception {
    public NumberBiggerThanHundredException(int i) {
        super("Oops, your number " + i + " is bigger than a hundred");
    }
}
