package io.qross;

import io.qross.ext.Console;
import io.qross.pql.PQL;

public class Main {
    public static void main(String[] args) {
        Console.writeLine("HELLO WORLD");
        PQL.runFile("/pql/hello.sql");
    }
}