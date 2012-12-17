package com.conceptichq;

import java.io.PrintStream;

public class SayHello {

    private String name;
    private static SayHello instance;

    private SayHello() {
        this.name = "Jānis : " + System.nanoTime();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say(PrintStream out) {
        if (name == null) {
            return;
        }
        out.println("Hello " + name.toLowerCase());
    }

    public static SayHello getInstance() {
        if (instance == null) {
            instance = new SayHello();
        }
        return instance;
    }

}
