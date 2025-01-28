package lessons.oop.abstract_examples.ex2;

public abstract class Subject {
    Subject() {
        System.out.println("Learning Subject");
    }

    abstract void syllabus();

    void Learn(){
        System.out.println("Preparing Right Now!");
    }
}
