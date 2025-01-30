Система конфигурации

1. Создай класс Configuration
   - он будет загружать и обрабатывать параметры из файла конфигурации (например, config.properties)
2. Создай внутренний enum для типов данных ConfigParamType: STRING, INTEGER, BOOLEAN
3. Создай статический вложенный класс ConfigParameter 
   - у него должны быть поля: name, value, type (enum: STRING, INTEGER, BOOLEAN).
4. Создай статический вложенный класс ConfigLoader 
   - должен содержать метод List<ConfigParameter> load(String filename) - загружает параметры из файла
5. Создай статический вложенный класс ConfigValidator 
   - должен содержать метод boolean isValid(ConfigParameter param) - проверяет корректность параметра
6. Обнови класс Configuration 
   - добавь метод loadAndValidate(String filename) - загружает параметры, валидирует их и возвращает список корректных параметров