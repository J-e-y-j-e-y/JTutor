Сложный адрес

1. Создай класс Address 
   - с полями: street (String), city (String), zipCode (String)
2. Cоздай класс Person 
   - с полями firstName (String), lastName (String) и address (Address). 
3. Переопределите equals() и hashCode() для классов Address и Person, учитывая следующие требования:
   - два объекта Address считаются равными, если их поля street, city и zipCode совпадают
   - два объекта Person считаются равными, если их поля firstName и lastName совпадают и их объекты address равны
   - сгенерируйте корректные hashCode() для обоих классов
4. Продемонстрируйте, что равенство работает корректно для объектов обоих классов.

Дополнительно:
5. Продемонстрируйте, что равенство работает корректно **с HashSet или HashMap** для объектов обоих классов.
