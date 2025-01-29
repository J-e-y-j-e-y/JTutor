package homework.oop.static_homework.task_2;

public class Main {

    public static void main(String[] args) {
        int aCounter = 0;
        int bCounter = 0;
        for (int i = 0; i < 10; i++) {
            int randNum_A = (int)(Math.random() * 10);
            aCounter += randNum_A;
            for (int a = 0; a < randNum_A; a++) {
                new AClass();
            }

            // как программа видит класс Math? Мы же его нигде не импортировали.
            int randNum_B = (int)(Math.random() * 10);
            bCounter += randNum_B;
            for (int b = 0; b < randNum_B; b++) {
                new BClass();
            }
        }
        System.out.println("Должно быть " + aCounter + " объектов класса AClass");
        System.out.println("Создалось " + AClass.aCounter + " объектов класса AClass");

        System.out.println("Должно быть " + bCounter + " объектов класса BClass");
        System.out.println("Создалось " + BClass.bCounter + " объектов класса BClass");
    }
}
