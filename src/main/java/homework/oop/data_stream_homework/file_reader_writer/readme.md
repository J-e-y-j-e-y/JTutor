Копирование файла с изменением регистра

Напиши программу, которая копирует содержимое одного текстового файла в другой,
преобразуя все символы в верхний регистр.

1. Программа должна принимать два аргумента командной строки:
    - имя исходного файла,
    - имя файла назначения.
2. Используй FileReader для чтения данных из исходного файла
3. Используй FileWriter для записи данных в файл назначения
4. Читай исходный файл посимвольно
5. Преобразуй каждый символ в верхний регистр перед записью в файл назначения
6. Обработай возможные исключения: FileNotFoundException и IOException
7. Гарантируй закрытие потоков