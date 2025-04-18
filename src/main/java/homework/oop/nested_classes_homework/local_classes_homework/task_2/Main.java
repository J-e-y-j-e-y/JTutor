package homework.oop.nested_classes_homework.local_classes_homework.task_2;

public class Main {
    public static void main(String[] args) {
        Category root = new Category("Root категория");
        Category cat1 = new Category("cat1");
        Category cat2 = new Category("cat2");
        Category cat3 = new Category("cat3");
        Category cat4 = new Category("cat4");
        root.addCategory(cat1);
        root.addCategory(cat2);
        root.addCategory(cat3);
        root.addCategory(cat4);

        Category.CategoryTreeProcessor ctp = root.new CategoryTreeProcessor();


    }
}
