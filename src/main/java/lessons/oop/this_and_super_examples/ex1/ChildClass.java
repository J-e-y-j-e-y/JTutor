package lessons.oop.this_and_super_examples.ex1;

public class ChildClass extends ParentClass{
    String args;
    ChildClass(){
        this(""); // вызов конструктора с одним аргументом класса ChildClass
        System.out.println("Конструктор без аргументов класса ChildClass");
    }

    ChildClass(String args){
        super(""); // вызов конструктора с одним аргументом класса A
        this.args = args;
        System.out.println("Конструктор с одним аргументом класса ChildClass");
    }
}
