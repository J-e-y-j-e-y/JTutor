package homework.collections.list.task_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTextBuffer implements TextBuffer {
    private final List<Character> buffer = new LinkedList<>();

    @Override
    public void insert(int position, String text) {
        List<Character> chars = new ArrayList<>();
        for (char c : text.toCharArray()) {
            chars.add(c);
        }
        buffer.addAll(position, chars);
    }

    @Override
    public void append(String text) {
        for (char c : text.toCharArray()) {
            buffer.add(c);
        }
    }

    @Override
    public void delete(int start, int end) {
        buffer.subList(start, end).clear();
    }

    @Override
    public String getText() {
        StringBuilder sb = new StringBuilder(buffer.size());
        for (Character c : buffer) {
            sb.append(c);
        }
        return sb.toString();
    }
}
