package homework.oop.nested_classes_homework.local_classes_homework.task_2;

import java.util.List;

public class Category {
    private String name;
    private List<Category> subCategories;

    public Category(String name) {
        this.name = name;
    }

    public void addCategory(Category category) {
        subCategories.add(category);
    }

    class CategoryTreeProcessor {
        public void processTree(Category rootCategory) {
            class CategoryProcessor {
                void processCategory(Category category) {
                    System.out.printf("Категория - %s", name);
                }
            }
        }
    }

}
