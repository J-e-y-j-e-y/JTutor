package homework.oop.classes_homework.task_1;

public class Person {
    private String fullName;
    private int age;

    public Person() {

    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println("Объект Person идет");
    }

    public void talk(Person p) {
        System.out.println(p.fullName + " говорит");
    }
}
