package homework.oop.interface_homework.task_2;

import java.util.ArrayList;

public class NumberArrayFilter implements Filter {
    @Override
    public boolean apply(Object o) {
        for (Object object : o) { // не понимаю что не нравится и как починить
            for (char c : object) { // не понимаю что не нравится и как починить
                if (Character.isDigit(c)) {
                    return false;
                }
            }
        }
        return true;
    }
}
