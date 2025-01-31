package homework.oop.interface_homework.task_2;

public class NullArrayFilter implements Filter {
    @Override
    public boolean apply(Object o) {
        return o != null;
    }
}
