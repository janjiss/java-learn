package com.conceptichq;

public class HelloLaucher {

    public static void main(String[] args) {

        // TODO continue from extracting name provider and name display
        // provider

        // service 1 knows only how to set nane
        SayHello intance = SayHello.getInstance();
        intance.setName("cits Jānis");

        // service 2 knows only how to display name
        SayHello intanceOther = SayHello.getInstance();
        intanceOther.say(System.out);

    }
}
