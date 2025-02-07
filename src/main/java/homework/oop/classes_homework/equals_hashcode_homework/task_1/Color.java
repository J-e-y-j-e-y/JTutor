package homework.oop.classes_homework.equals_hashcode_homework.task_1;

import java.util.Objects;

public class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        if (red >= 0 && red <= 255) {
            this.red = red;
        } else {
            System.out.println("Red меньше 0 и больше 255");
            throw new IllegalArgumentException("Red меньше 0 и больше 255");
        }

        if (green >= 0 && green <= 255) {
            this.green = green;
        } else {
            System.out.println("green меньше 0 и больше 255");
            throw new IllegalArgumentException("green меньше 0 и больше 255");
        }

        if (blue >= 0 && blue <= 255) {
            this.blue = blue;
        } else {
            System.out.println("blue меньше 0 и больше 255");
            throw new IllegalArgumentException("blue меньше 0 и больше 255");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return this.red == color.red && this.green == color.green && this.blue == color.blue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(red, green, blue);
    }

    @Override
    public String toString() {
        return "Color{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
