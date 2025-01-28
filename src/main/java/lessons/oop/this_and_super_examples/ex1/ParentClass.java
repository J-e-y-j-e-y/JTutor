package lessons.oop.this_and_super_examples.ex1;

public class ParentClass {
    ParentClass(){
        System.out.println("Конструктор без аргументов класса ParentClass");
    }

    ParentClass(String args){
        System.out.println("Конструктор с одним аргументом класса ParentClass");
    }
}
