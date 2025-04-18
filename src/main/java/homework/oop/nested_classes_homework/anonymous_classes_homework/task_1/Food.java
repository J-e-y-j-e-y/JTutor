package homework.oop.nested_classes_homework.anonymous_classes_homework.task_1;

public class Food {
    String dishName;

    public void prepare(Cookable recipe, String dishName) {
        System.out.printf("Название блюда - %s\n", dishName);
        System.out.printf("Способ приготовления: %s\n", recipe.cook());
    }
}
