package lessons.oop.interface_examples.ex4_extend_interf;

public class ExampleClass implements B{
    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    // @Override - можно и не указывать, но лучше указывать
    public void method2() {
        System.out.println("Method 2");
    }

    @Override
    public void method3() {
        System.out.println("Method 3");
    }

    public static void main(String[] args){
        ExampleClass x = new ExampleClass();

        x.method1();
        x.method2();
        x.method3();
    }
}
