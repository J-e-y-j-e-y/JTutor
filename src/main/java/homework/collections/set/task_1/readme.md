Генерация уникальных ID (Unique ID Generator)

Требования:

- Используй HashSet для хранения уже сгенерированных ID (HashSet гарантирует уникальность элементов)
- Реализуй метод generateId(), который генерирует новый уникальный ID
  (например, случайное число, UUID, или комбинированный ID):
    - Перед генерацией нового ID:
        - проверь, существует ли он уже в HashSet
        - если ID уже существует, сгенерируй новый, пока не получится уникальный
    - Верни сгенерированный уникальный ID

Дополнительно:

- Реализуй возможность генерации ID определенного формата (например, UUID, или ID с префиксом)