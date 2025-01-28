package lessons.oop.enum_examples;

public class TestExamples {
    enum NewColor {
        RED,
        GREEN,
        BLUE;

        private NewColor() {
            System.out.println("Constructor called for : " + this.toString());
        }

        public void colorInfo() {
            System.out.println("Universal Color");
        }
    }

    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);

        NewColor newColor = NewColor.RED;
        System.out.println(newColor);
        newColor.colorInfo();

        for (Color color : Color.values()) {
            System.out.println(color);
        }

        // Switch case with Enum
        switch (c1) {
            case RED:
                System.out.println("Red color observed");
                break;
            case GREEN:
                System.out.println("Green color observed");
                break;
            case BLUE:
                System.out.println("Blue color observed");
                break;
            default:
                System.out.println("Other color observed");
        }


    }
}
