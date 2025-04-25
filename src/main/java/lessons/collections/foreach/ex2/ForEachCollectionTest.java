package lessons.collections.foreach.ex2;

import java.util.ArrayList;
import java.util.List;

public class ForEachCollectionTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Snoopy");
        names.add("Charlie");
        names.add("Linus");
        names.add("Shroeder");
        names.add("Woodstock");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
