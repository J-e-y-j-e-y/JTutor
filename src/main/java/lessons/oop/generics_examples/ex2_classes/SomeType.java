package lessons.oop.generics_examples.ex2_classes;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SomeType<T> {
    public <E> void test(Collection<E> collection) {
        for (E element : collection) {
            System.out.println(element);
        }
    }

    public void test(List<Integer> collection) {
        for (Integer element : collection) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        SomeType<String> st = new SomeType<>();
        List<String> list = Arrays.asList("test");
        st.test(list);

        // java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
//        SomeType st2 = new SomeType();
//        List<String> list2 = Arrays.asList("test");
//        st2.test(list2);
    }
}
