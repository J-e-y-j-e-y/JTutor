package homework.oop.interface_homework.task_2;

import java.util.Arrays;

public class NumberArrayFilter implements Filter {
    @Override
    public boolean apply(Object o) {

        String str = (String) o;

        // Если строка null или строка с числами + удаляем её!
        if (o == null || str.matches(".*\\d+.*")) {
            return true;
        }

        return false;

    }

    @Override
    public Object[] filter(Object[] array, Filter filter) {
        int offset = 0;

        for(int i = 0; i< array.length; i++){
            if(filter.apply(array[i])){
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
