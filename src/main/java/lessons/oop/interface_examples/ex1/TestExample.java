package lessons.oop.interface_examples.ex1;

public class TestExample {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();

        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.print("Bicycle present state : ");
        bicycle.printStates();

        // Instance of Bike (Object)
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.print("Bike present state : ");
        bike.printStates();
    }
}
