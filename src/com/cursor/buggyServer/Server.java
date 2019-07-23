package com.cursor.buggyServer;

import com.cursor.buggyServer.exceptions.NotAPalindromeException;
import com.cursor.buggyServer.exceptions.NullObjectException;
import com.cursor.buggyServer.exceptions.NumberBiggerThanHundredException;
import com.cursor.buggyServer.exceptions.OddNumberException;

class Server {
    private static final int HUNDRED = 100;

    void process(int integerToProcess) throws NumberBiggerThanHundredException, OddNumberException {
        if (integerToProcess > HUNDRED) {
            throw new NumberBiggerThanHundredException(integerToProcess);
        }
        if (integerToProcess % 2 != 0) {
            throw new OddNumberException(integerToProcess);
        }
        System.out.println("Number " + integerToProcess + " processed successfully");
    }

    void process(String stringToProcess) throws NotAPalindromeException {
        if (null == stringToProcess) {
            throw new NotAPalindromeException("null");
        }
        String processed = stringToProcess.replace(" ", "").toLowerCase();
        if (processed.equals(new StringBuilder(processed).reverse().toString())) {
            System.out.println("Your palindrome string " + stringToProcess + " processed successfully");
        } else throw new NotAPalindromeException(stringToProcess);
    }

    void process(Object objectToProcess) throws NullObjectException {
        if (null == objectToProcess) {
            throw new NullObjectException();
        }
        System.out.println("Your object processed successfully");
    }
}
