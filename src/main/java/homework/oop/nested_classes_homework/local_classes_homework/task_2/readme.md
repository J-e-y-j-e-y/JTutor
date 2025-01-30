Обработка дерева категорий

1. Создай класс Category со следующими характеристиками:
   - поле name (название категории)
   - поле List<Category> subCategories (список подкатегорий)
2. В Category добавь метод addCategory(Category category) для добавления подкатегории в список подкатегорий.
3. Создай класс CategoryTreeProcessor.
   - добавь метод processTree(Category rootCategory).
     - в методе processTree создайте локальный класс CategoryProcessor, с методом void processCategory(Category category), который будет:
       - выводить название категории.
       - рекурсивно вызывать processCategory для всех подкатегорий.
     - метод processTree должен вызывать метод processCategory для корневой категории.