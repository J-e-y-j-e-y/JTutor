package lessons.collections.list.arraylist.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {
        removeAll();

        addAll_clear();

        retainAll();

        arrayListToString();
    }

    public static void split() {
        System.out.println();
        System.out.println("------------------------");
    }

    public static void removeAll() {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add("F");
        arrayList.add(1, "A2");
        arrayList.set(0, "C2");

        List<String> removeElements = List.of("C2", "A2", "AA", "F");
        System.out.println("Содержимое arrayList до removeAll: "
                + arrayList);

        arrayList.removeAll(removeElements);
        System.out.println("Содержимое arrayList после removeAll: "
                + arrayList);
        split();
    }

    public static void addAll_clear() {
        List<String> arrayList1 = new ArrayList<>();
        List<String> arrayList2 = List.of("1", "2");

        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.add("D");
        arrayList1.add("E");
        arrayList1.add("F");
        System.out.println("arrayList1 до добавления " + arrayList1);

        arrayList1.addAll(3, arrayList2);
        System.out.println("arrayList1 после добавления " + arrayList1);

        arrayList1.clear();
        System.out.println("arrayList1 после очистки " + arrayList1);
        split();
    }

    public static void retainAll() {
        List<String> arrayList1 = new ArrayList<>();
        List<String> arrayList2 = List.of("F", "FF", "E");

        arrayList1.add("A");
        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.add("D");
        arrayList1.add("E");
        arrayList1.add("F");
        arrayList1.add("F");

        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);
        split();
    }

    public static void arrayListToString() {
        List<String> arrayList = List.of("C", "A", "E", "B", "D", "F");
        //1 вариант
        Object[] objectArray = arrayList.toArray();
        System.out.println(Arrays.toString(objectArray));

        //2 вариант
        String[] stringArray1 = new String[arrayList.size()];
        arrayList.toArray(stringArray1);
        System.out.println(Arrays.toString(stringArray1));

        //3 вариант
        String[] stringArray2 = arrayList.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray2));
    }
}
