package homework.oop.interface_homework.task_2;

import java.util.Arrays;

public class NullArrayFilter implements Filter {
    @Override
    public boolean apply(Object o) {
        // Если строка null - удаляем её!
        if (o == null) return true;
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
