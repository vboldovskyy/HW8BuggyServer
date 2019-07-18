package com.cursor.buggyServer;

import com.cursor.buggyServer.exceptions.NotAPalindromeException;
import com.cursor.buggyServer.exceptions.NullObjectException;
import com.cursor.buggyServer.exceptions.NumberBiggerThanHundredException;
import com.cursor.buggyServer.exceptions.OddNumberException;

class ServerTest {

    void run() {
        generateStackOverflow();
        generateOutOfMemory();
        Server server = new Server();
        try {
            server.process(16);
            server.process(19);
        } catch (OddNumberException | NumberBiggerThanHundredException e) {
            print(e);
        }
        try {
            server.process(116);
        } catch (NumberBiggerThanHundredException | OddNumberException e) {
            print(e);
        }
        try {
            server.process("Лазер Боре хер обрезал");
            server.process("Counting stars");
        } catch (NotAPalindromeException e) {
            print(e);
        }
        try {
            server.process(new Object());
            Object o = null;
            server.process(o);
        } catch (NullObjectException e) {
            print(e);
        }
    }

    private void print(Exception e) {
        if (null == e){
            return;
        }
        System.out.println(e.getMessage());
    }

    private void generateStackOverflow() {
        try {
            loop();
        } catch (StackOverflowError soe) {
            System.out.println("Got StackOverFlowError");
        }
    }

    private void generateOutOfMemory() {
        try {
            String[] fail = new String[Integer.MAX_VALUE];
        } catch (OutOfMemoryError oome) {
            System.out.println("Got OutOfMemoryError");
        }
    }

    private void loop() {
        loop();
    }
}
