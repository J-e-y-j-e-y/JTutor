package homework.oop.nested_classes_homework.anonymous_classes_homework.task_1;

public class TestFood {
    public static void main(String[] args) {
        Food food1 = new Food();
        food1.prepare(new Cookable() {
            @Override
            public String cook() {
                return "Здесь мог бы быть рецепт борщ";
            }
        }, "Борщ");
    }
}
