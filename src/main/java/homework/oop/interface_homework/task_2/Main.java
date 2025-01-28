package homework.oop.interface_homework.task_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String array[] = new String[]{"1rewf ", "feefewf", "a", null, "1"};
        System.out.println("Исходный массив: " + Arrays.toString(array));

        // сделай так, чтобы код в комментариях заработал

        // Filter nullArrayFilter = new NullArrayFilter();
        // String[] newArray = (String[]) filter(array, nullArrayFilter);
        // System.out.println("Исходный массив с фильтром NullArrayFilter: " + Arrays.toString(newArray));

        // Filter numberArrayFilter = new NullArrayFilter();
        // String[] newArray2 = (String[]) filter(array, numberArrayFilter);
       // System.out.println("Исходный массив с фильтром NumberArrayFilter: " + Arrays.toString(newArray2));

        // вывод должен быть таким:
        /*Исходный массив: [1rewf , feefewf, a, null, 1]
        Исходный массив с фильтром NullArrayFilter: [1rewf , feefewf, a, 1]
        Исходный массив с фильтром NumberArrayFilter: [feefewf, a]*/
    }

    public static Object[] filter(Object[] array, Filter filter) {
        int offset = 0;

        for(int i = 0; i< array.length; i++){
            if(!filter.apply(array[i])){
                offset++;
            } else{
                array[i - offset] = array[i];
            }
        }

        // Arrays.copyOf копирует значение из массива array в новый массив
        // с длинной array.length - offset
        return Arrays.copyOf(array, array.length - offset);
    }
}
