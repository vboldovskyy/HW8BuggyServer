package com.cursor.buggyServer;

import com.cursor.buggyServer.exceptions.NotAPalindromeException;
import com.cursor.buggyServer.exceptions.NullObjectException;
import com.cursor.buggyServer.exceptions.NumberBiggerThanHundredException;
import com.cursor.buggyServer.exceptions.OddNumberException;

class Server {
    private static final int HUNDRED = 100;

    void process(int i) throws NumberBiggerThanHundredException, OddNumberException {
        if (i > HUNDRED) {
            throw new NumberBiggerThanHundredException(i);
        }
        if (i % 2 != 0) {
            throw new OddNumberException(i);
        }
        System.out.println("Number " + i + " processed successfully");
    }

    void process(String s) throws NotAPalindromeException {
        if (null == s) {
            throw new NotAPalindromeException("null");
        }
        String processed = s.replace(" ", "").toLowerCase();
        if (processed.equals(new StringBuilder(processed).reverse().toString())) {
            System.out.println("Your palindrome string " + s + " processed successfully");
        } else throw new NotAPalindromeException(s);
    }

    void process(Object o) throws NullObjectException {
        if (null == o) {
            throw new NullObjectException();
        }
        System.out.println("Your object processed successfully");
    }
}
