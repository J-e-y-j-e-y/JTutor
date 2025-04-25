Текстовый редактор с буфером (Text Editor with Buffer)

Реализуй упрощенный текстовый редактор с буфером, который позволяет добавлять, удалять и вставлять текст в определенные
позиции

Требования:

1) Посмотреть интерфейс TextBuffer:
    - void insert(int position, String text): Вставляет текст text в позицию position
    - void append(String text): Добавляет текст text в конец буфера
    - void delete(int start, int end): Удаляет текст из позиции start до end (не включая end)
    - String getText(): Возвращает текущий текст в буфере
2) Сделать 3 реализации интерфейса TextBuffer:
    - ArrayListTextBuffer: Реализует интерфейс TextBuffer с использованием ArrayList<Character> для хранения текста
    - LinkedListTextBuffer: Реализует интерфейс TextBuffer с использованием LinkedList<Character> для хранения текста
3) Алгоритмы:
    - insert():
        - ArrayListTextBuffer:
            - создай новый ArrayList с нужным размером,
            - скопируй символы до position,
            - вставь text,
            - скопируй оставшиеся символы.
        - LinkedListTextBuffer:
            - найди узел списка, соответствующий позиции position,
            - создай новые узлы для символов в text,
            - вставь их в список.
    - append():
        - ArrayListTextBuffer: добавь все символы из text в конец списка
        - LinkedListTextBuffer: добавь все символы из text в конец списка
    - delete():
        - ArrayListTextBuffer: используй list.subList(start, end).clear()
        - LinkedListTextBuffer:
            - найди узлы списка, соответствующие позициям start и end,
            - удали все узлы между ними.
4) Протестируй, запустив код в TextEditorBenchmark
    - Сравни производительность для разных типов операций
      *ты должен увидеть, что ArrayList быстрее для операций добавления (в конец) и удаления диапазонов,
      а LinkedList быстрее для вставки (в середину большого текста).*