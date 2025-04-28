package homework.oop.interface_homework.task_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String array[] = new String[]{"1rewf ", "feefewf", "a", null, "1", null, "aa45"};
        System.out.println("Исходный массив: " + Arrays.toString(array));

        // сделай так, чтобы код в комментариях заработал

        Filter nullArrayFilter = new NullArrayFilter();
        String[] newArray = (String[]) nullArrayFilter.filter(array, nullArrayFilter);
        System.out.println("Исходный массив с фильтром NullArrayFilter: " + Arrays.toString(newArray));

        Filter numberArrayFilter = new NumberArrayFilter();
        String[] newArray2 = (String[]) numberArrayFilter.filter(array, numberArrayFilter);
        System.out.println("Исходный массив с фильтром NumberArrayFilter: " + Arrays.toString(newArray2));

        // вывод должен быть таким:
        /*Исходный массив: [1rewf , feefewf, a, null, 1]
        Исходный массив с фильтром NullArrayFilter: [1rewf , feefewf, a, 1]
        Исходный массив с фильтром NumberArrayFilter: [feefewf, a]*/
    }

}
