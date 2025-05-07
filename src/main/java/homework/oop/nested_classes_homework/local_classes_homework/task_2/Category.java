package homework.oop.nested_classes_homework.local_classes_homework.task_2;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Category> subcategories = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Category> getSubcategories() {
        return subcategories;
    }

    public void addCategory(Category category) {
        subcategories.add(category);
    }

    public static void main(String[] args) {
        Category rootCategory = new Category("root категория");

        Category category1 = new Category("вложенная категория 1");
        Category category2 = new Category("вложенная категория 2");
        Category category3 = new Category("вложенная категория 3");

        rootCategory.addCategory(category1);
        rootCategory.addCategory(category2);
        rootCategory.addCategory(category3);

        CategoryTreeProcessor treeProcessor = new CategoryTreeProcessor();
        treeProcessor.processTree(rootCategory);

    }
}
