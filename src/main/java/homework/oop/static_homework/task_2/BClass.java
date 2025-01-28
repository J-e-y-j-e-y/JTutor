package homework.oop.static_homework.task_2;

public class BClass {
    static int bCounter;

    static {
        bCounter++;
    }

    {
        bCounter = 0;
    }
}
