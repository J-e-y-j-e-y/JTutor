История поиска с ограничением и приоритетом

Создай систему хранения истории поисковых запросов пользователя.
Важно, чтобы история имела ограниченный размер, и чтобы последние запросы имели приоритет
(если пользователь снова вводит запрос, он перемещается в конец истории)

Требования:
- LinkedHashSet<String> для хранения истории поисковых запросов
- int maxSize – максимальный размер истории
- Методы:
- addQuery(String query):
- если запрос уже есть в истории, удали его и добавьте снова в конец (чтобы переместить его в конец списка, показывая,
что он был недавно использован)
- если запрос новый, добавьте его в конец
- если размер истории превышает maxSize, удали самый старый запрос
- getHistory(): верни историю запросов в порядке их последнего использования