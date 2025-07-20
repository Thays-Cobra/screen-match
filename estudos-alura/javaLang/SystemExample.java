package javaLang;

import java.io.IOException;
import java.io.PrintStream;

public class SystemExample {

    public static void main(String[] args) {
        PrintStream output = System.out;
        output.println("Hello World");

        try {
            int in = System.in.read();
            output.println(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.exit(0);
    }

}
