package homework.oop.nested_classes_homework.anonymous_classes_homework.task_1;

public class Food {
    public void prepare(Cookable recipe, String dishName) {
        System.out.println(dishName);
        recipe.cook();
    }

    public static void main(String[] args) {
        Cookable recipe = new Cookable() {
            @Override
            public void cook() {
                System.out.println("Рецепт приготовления");
            }
        };

        Food food = new Food();
        food.prepare(recipe, "Борщ");
        food.prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Другой рецепт приготовления");
            }
        }, "Щи");

    }
}
