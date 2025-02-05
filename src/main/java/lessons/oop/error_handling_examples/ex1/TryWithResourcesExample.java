package lessons.oop.error_handling_examples.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourcesExample {

    static class MyException extends RuntimeException {
        public MyException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            String result = input();
        } catch (MyException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String input() throws MyException, IOException {
        String s = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        if (s.equals("")) {
            throw new MyException("String can not be empty!");
        }
        System.out.println("Была считана строка: " + s);
        return s;
    }
}
