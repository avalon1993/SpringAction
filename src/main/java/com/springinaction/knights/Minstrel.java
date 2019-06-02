package com.springinaction.knights;

import java.io.PrintStream;

public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        stream.println("Fa lalala,the knight is so brave!!!");
    }

    public void singAfterQuest() {
        stream.println("The hee here, hte brace knight did embark on a quest!!");
    }

}
