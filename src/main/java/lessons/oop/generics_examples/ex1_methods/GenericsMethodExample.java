package lessons.oop.generics_examples.ex1_methods;

import java.util.Arrays;
import java.util.List;

public class GenericsMethodExample {
    public static class Util {
        public static <T> T getValue(Object obj, Class<T> clazz) {
            return (T) obj;
        }

        public static <T> T getValue(Object obj) {
            return (T) obj;
        }
    }

    public static void main(String[] args) {
        List list = Arrays.asList("Author", "Book");

        for (Object element : list) {
            String data = Util.getValue(element, String.class);
            System.out.println(data);
            System.out.println(Util.<String>getValue(element));
        }

        List listNums = Arrays.asList(1, 2);

        for (Object element : listNums) {
            int data = Util.getValue(element, Integer.class);
            System.out.println(data);
            System.out.println(Util.<Integer>getValue(element));
        }

        // так делать можно, но это нехорошо
        List listObjs = Arrays.asList(9, "Hello");

        for (Object element : listObjs) {
            Object data = Util.getValue(element, Object.class);
            System.out.println(data);
            System.out.println(Util.<Object>getValue(element));
        }
    }
}
