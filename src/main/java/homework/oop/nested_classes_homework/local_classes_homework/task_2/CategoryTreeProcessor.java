package homework.oop.nested_classes_homework.local_classes_homework.task_2;

class CategoryTreeProcessor {

    public void processTree(Category rootCategory) {
        class CategoryProcessor {
            void processCategory(Category category) {
                System.out.println(category.getName());

            }
        }
        CategoryProcessor categoryProcessor = new CategoryProcessor();
        categoryProcessor.processCategory(rootCategory);
        for (Category sub : rootCategory.getSubcategories())
            categoryProcessor.processCategory(sub);
    }

    ;
}