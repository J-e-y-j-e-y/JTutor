package homework.oop.static_homework.task_2;

public class BClass {
    static int bCounter;

    // при создании объекта будет вызван конструктор по умолчанию
    // BClass() {
    // }

    // статический блок, будет вызван один раз после загрузки класса в память
    static {
        bCounter = 0;
        System.out.println("Загрузка класса B в память");
    }

    // блок инициализации, будет вызван после создания объекта
    {
        bCounter++;
    }


}
