package homework.oop.classes_homework.equals_hashcode_homework.task_1;

import java.util.Objects;

public class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) throws Exception {
        if (red >= 0 && red <= 255) {
            this.red = red;
        } else {
            throw new Exception("Красный цвет не в том диапазоне");
        }
        if (green >= 0 && green <= 255) {
            this.green = green;

        } else {
            throw new Exception("Зеленый цвет не в том диапазоне");
        }
        if (blue >= 0 && blue <= 255) {
            this.blue = blue;

        } else {
            throw new Exception("Голубой цвет не в том диапазоне");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return red == color.red && green == color.green && blue == color.blue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(red, green, blue);
    }

    public static void main(String[] args) throws Exception {
        Color color1 = new Color(125, 125, 125);
        Color color2 = new Color(34, 34, 34);
        System.out.println(color1.hashCode());
        System.out.println(color2.hashCode());
        System.out.println(color1.equals(color2));
        Color color3 = new Color(760, 100, 100);

    }
}
