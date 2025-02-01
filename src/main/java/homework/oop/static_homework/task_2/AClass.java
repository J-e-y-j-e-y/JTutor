package homework.oop.static_homework.task_2;

public class AClass {
    static int aCounter;
    int a;

    static {
        // необязательно добавлять инициализацию статической переменной
        // она будет проинициализирована значением по умолчанию при загрузке класса
        System.out.println("Загрузка класса А в память");
    }

    {
        aCounter++;
    }
}
