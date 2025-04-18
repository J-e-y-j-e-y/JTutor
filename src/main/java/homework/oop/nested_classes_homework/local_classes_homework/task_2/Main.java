package homework.oop.nested_classes_homework.local_classes_homework.task_2;

public class Main {
    public static void main(String[] args) {
        Category root = new Category("Root");
        Category cat1 = new Category("cat1");
        Category cat2 = new Category("cat2");
        Category cat3 = new Category("cat3");
        Category cat4 = new Category("cat4");
        Category cat21 = new Category("cat21");
        Category cat22 = new Category("cat22");
        Category cat23 = new Category("cat23");
        Category cat24 = new Category("cat24");

        root.addCategory(cat1);
        root.addCategory(cat2);
        root.addCategory(cat3);
        root.addCategory(cat4);

        cat2.addCategory(cat21);
        cat2.addCategory(cat22);
        cat2.addCategory(cat23);
        cat2.addCategory(cat24);

        Category.CategoryTreeProcessor ctp = root.new CategoryTreeProcessor();
        ctp.processTree(root);

    }
}
