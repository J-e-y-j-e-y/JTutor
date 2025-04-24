package homework.oop.classes_homework.equals_hashcode_homework.task_1;

import java.util.Objects;

public class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        validateColorValue(red);
        validateColorValue(green);
        validateColorValue(blue);
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    private void validateColorValue(int value) {
        if (value < 0 || value > 255) {
            throw new IllegalArgumentException("Значение должно быть от 0 до 255");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return red == color.red && green == color.green && blue == color.blue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(red, green, blue);
    }

    public static void main(String[] args) {
        Color c1 = new Color(5, 3, 4);
        Color c2 = new Color(5, 3, 4);

        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode() == c2.hashCode());

    }
}
