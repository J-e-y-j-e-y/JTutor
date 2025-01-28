package lessons.oop.static_examples.static_override;

public class ChildClass extends ParentClass {
     //@Override //- ошибка
    // можно только создать точно такой же метод, он будет вызван, но по факту это не переопределение метода
    static void parentStaticMethod() {
        System.out.println("Child static method");
    }
}
