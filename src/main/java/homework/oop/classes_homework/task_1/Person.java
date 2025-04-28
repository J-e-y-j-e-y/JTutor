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

    // Можно ли складывать число и строку без явного приведения типов?
    @Override
    public String toString() {
        return "Person{" + "fullName='" + fullName + '\'' + ", age=" + age + '}';
    }

    public void move() {
        System.out.println(this + " идет");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }
}
