package lessons.oop.work_with_string_examples.ex1_basics;

import java.io.PrintWriter;
import java.io.StringWriter;

public class MultiLineStringExample {
    public static void main(String[] args) {
        // Тройные кавычки
        String triple = """
                Get busy living
                or
                get busy dying.
                --Stephen King""";
        System.out.println(triple);

        // String Writer
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println("Get busy living");
        printWriter.println("or");
        printWriter.println("get busy dying.");
        printWriter.println("--Stephen King");
        System.out.println(stringWriter.toString());

        // Google's Guava
    }
}
