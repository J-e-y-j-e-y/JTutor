package lessons.oop.interface_examples.ex2_multiple_inh;

public class Calculator implements Add, Sub{
    // Method to add two numbers
    public int add(int a,int b){
        return a+b;
    }

    // Method to sub two numbers
    public int sub(int a,int b){
        return a-b;
    }
}
