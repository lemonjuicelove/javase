package com.whut.java.homework;

public class TicketNotEnough extends Throwable {

    public TicketNotEnough() {
    }

    public TicketNotEnough(String message) {
        super(message);
    }
}
