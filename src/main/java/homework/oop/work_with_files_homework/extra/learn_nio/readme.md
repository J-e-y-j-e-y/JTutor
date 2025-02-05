Мониторинг изменений в директории (**сложное**)

Напиши программу, которая отслеживает изменения в заданной директории
и выводит сообщения о создании, удалении и изменении файлов

1) Программа должна принимать путь к директории в качестве аргумента командной строки
2) Используй java.nio.file.WatchService для отслеживания изменений в директории
3) Зарегистрируй программу для отслеживания событий:
    - ENTRY_CREATE,
    - ENTRY_DELETE,
    - ENTRY_MODIFY.
4) В цикле ожидай событий и выводи информацию о каждом событии (тип события, имя файла)
5) Обработайте возможные исключения: IOException, InterruptedException, ClosedWatchServiceException

[про WatchService №1](https://www.baeldung.com/java-nio2-watchservice)
[про WatchService №2](https://www.geeksforgeeks.org/watch-a-directory-for-changes-in-java/)