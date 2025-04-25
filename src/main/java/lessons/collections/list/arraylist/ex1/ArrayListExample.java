package lessons.collections.list.arraylist.ex1;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        printListSize();

        iterateOverListAndReversed();

        searchElemInList();

        removeElem();

        extraMethods();
    }

    public static void split() {
        System.out.println();
        System.out.println("------------------------");
    }

    public static void printListSize() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list.size()); // 2
        split();
    }

    public static void iterateOverListAndReversed() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1, 3);
        System.out.println(list);
        ListIterator<Integer> it = list.listIterator(list.size());

        List<Integer> result = new ArrayList<>(list.size());
        while (it.hasPrevious()) {
            Integer previous = it.previous();
            result.add(previous);
            System.out.println(previous);
        }

        Collections.reverse(list);
        System.out.println(list);
        split();
    }

    public static void searchElemInList() {
        List<String> stringsToSearch = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            stringsToSearch.add(Integer.toHexString(i));
        }
        System.out.println(stringsToSearch);
        // поиск в несортированном списке
        // метод для поиска
        System.out.println(stringsToSearch.indexOf("a")); // 10

        Iterator<String> it = stringsToSearch.iterator();
        Set<String> matchingStrings = new HashSet<>(Arrays.asList("a", "c", "9"));

        // поиск с помощью итератора
        List<String> result = new ArrayList<>();
        while (it.hasNext()) {
            String s = it.next();
            if (matchingStrings.contains(s)) {
                result.add(s);
            }
        }
        System.out.println(result);

        // поиск в отсортированном списке
        List<String> copy = new ArrayList<>(stringsToSearch);
        System.out.println(copy);
        Collections.sort(copy);
        System.out.println(copy);
        int index = Collections.binarySearch(copy, "f");
        System.out.println(index);
        System.out.println(Collections.binarySearch(copy, "такого нет"));

        split();
    }

    public static void removeElem() {
        List<String> stringsToSearch = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            stringsToSearch.add(Integer.toHexString(i));
        }
        System.out.println(stringsToSearch);
        Set<String> matchingStrings = new HashSet(Arrays.asList("a", "b", "c", "d", "e", "f"));

        Iterator<String> it = stringsToSearch.iterator();
        while (it.hasNext()) {
            if (matchingStrings.contains(it.next())) {
                it.remove();
                System.out.println(stringsToSearch);
            }
        }
        System.out.println(stringsToSearch);
        split();
    }

    public static void extraMethods() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(3, 1, 2));

        System.out.println(arrayList.getFirst());

        System.out.println(arrayList.getLast());

        System.out.println(arrayList);
        arrayList.addFirst(4);
        System.out.println(arrayList);

        arrayList.addLast(5);
        System.out.println(arrayList);

        arrayList.removeFirst();
        System.out.println(arrayList);

        arrayList.removeLast();
        System.out.println(arrayList);

        split();
    }
}
