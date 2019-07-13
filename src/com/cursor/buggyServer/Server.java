package com.cursor.buggyServer;

import com.cursor.buggyServer.exceptions.NotAPalindromeException;
import com.cursor.buggyServer.exceptions.NullObjectException;
import com.cursor.buggyServer.exceptions.NumberBiggerThanHundredException;
import com.cursor.buggyServer.exceptions.OddNumberException;

class Server {

    void process(int i) throws NumberBiggerThanHundredException, OddNumberException {
        if (i % 2 != 0) {
            throw new OddNumberException(i);
        }
        if (i > 100) {
            throw new NumberBiggerThanHundredException(i);
        }
        System.out.println("Number " + i + " processed successfully");
    }

    void process(String s) throws NotAPalindromeException {
        String processed = s.replace(" ", "").toLowerCase();
        if (processed.equals(new StringBuilder(processed).reverse().toString())) {
            System.out.println("Your palindrome string " + s + " processed successfully");
        } else throw new NotAPalindromeException(s);
    }

    void process(Object o) throws NullObjectException {
        if (o == null) {
            throw new NullObjectException();
        }
        System.out.println("Your object processed successfully");
    }
}
