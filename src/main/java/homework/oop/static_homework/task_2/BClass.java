package homework.oop.static_homework.task_2;

public class BClass {
    static int bCounter;

    public BClass() {
        System.out.println("В конструкторе B класса bCounter = " + bCounter);
    }

    static {
        //bCounter++;
    }

    {
        bCounter ++;
        System.out.println("Увеличил счетчик. bCounter = " + bCounter);
    }
}
