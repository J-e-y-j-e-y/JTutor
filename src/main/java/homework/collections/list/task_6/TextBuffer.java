package homework.collections.list.task_6;

public interface TextBuffer {
    void insert(int position, String text);

    void append(String text);

    void delete(int start, int end);

    String getText();
}
