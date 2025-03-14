package homework.oop.classes_homework.task_1;

public class Person {
    private String fullName;
    private int age;

    Person() {
        this("Аноним", 0);
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(this + "Я двигаюсь!");
    }

    public void  talk() {
        System.out.println(this + "Person говорит!");
    }

    @Override
    public String toString() {
        return "Person" + " " +
                fullName + " " +
                age;
    }
}
