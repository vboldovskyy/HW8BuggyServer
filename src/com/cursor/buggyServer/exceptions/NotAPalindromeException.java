package com.cursor.buggyServer.exceptions;

public class NotAPalindromeException extends Exception {

    public NotAPalindromeException(String s) {
        super("Oops, your string \"" + s + "=\' is not a palindrome");
    }

}
