package homework.oop.classes_homework.equals_hashcode_homework.task_1;

public class Main {
    final static void main(String[] args) {
        Color color1 = new Color(0, 0, 0);
        System.out.println(color1);

        Color color2 = new Color(0, 0, 255);
        System.out.println(color2);

        Color color3 = new Color(0, 0, 255);

        System.out.println(color3.equals(color2));
        // Коллизия хэш коды равны, а объекты нет
        System.out.println(color3.hashCode());
        System.out.println(color2.hashCode());
    }
}
