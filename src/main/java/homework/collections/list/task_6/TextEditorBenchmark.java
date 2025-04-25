package homework.collections.list.task_6;

import java.util.Random;

public class TextEditorBenchmark {
    private static final int NUM_OPERATIONS = 10000;
    private static final int TEXT_LENGTH = 100;
    private static final Random random = new Random();

    public static void main(String[] args) {
        // Прогрев
        runBenchmark(new ArrayListTextBuffer(), "ArrayList (Warmup)", 100);
        runBenchmark(new LinkedListTextBuffer(), "LinkedList (Warmup)", 100);

        // Основные измерения
        runBenchmark(new ArrayListTextBuffer(), "ArrayList", NUM_OPERATIONS);
        runBenchmark(new LinkedListTextBuffer(), "LinkedList", NUM_OPERATIONS);

        // Вставка
        runInsertionBenchmark(new ArrayListTextBuffer(), "ArrayList", NUM_OPERATIONS);
        runInsertionBenchmark(new LinkedListTextBuffer(), "LinkedList", NUM_OPERATIONS);

        // Добавление
        runAppendBenchmark(new ArrayListTextBuffer(), "ArrayList", NUM_OPERATIONS);
        runAppendBenchmark(new LinkedListTextBuffer(), "LinkedList", NUM_OPERATIONS);

        //Удаление
        runDeleteBenchmark(new ArrayListTextBuffer(), "ArrayList", NUM_OPERATIONS);
        runDeleteBenchmark(new LinkedListTextBuffer(), "LinkedList", NUM_OPERATIONS);
    }

    private static void runBenchmark(TextBuffer buffer, String bufferType, int numOperations) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            performRandomOperation(buffer);
        }
        long endTime = System.nanoTime();
        double duration = (double) (endTime - startTime) / 1_000_000.0;
        System.out.println(bufferType + ": " + duration + " мс");
    }

    private static void runInsertionBenchmark(TextBuffer buffer, String bufferType, int numOperations) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            performOperation(buffer, 0);
        }
        long endTime = System.nanoTime();
        double duration = (double) (endTime - startTime) / 1_000_000.0;
        System.out.println("INSERT) " + bufferType + ": " + duration + " мс");
    }

    private static void runAppendBenchmark(TextBuffer buffer, String bufferType, int numOperations) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            performOperation(buffer, 1);
        }
        long endTime = System.nanoTime();
        double duration = (double) (endTime - startTime) / 1_000_000.0;
        System.out.println("APPEND) " + bufferType + ": " + duration + " мс");
    }

    private static void runDeleteBenchmark(TextBuffer buffer, String bufferType, int numOperations) {
        for (int i = 0; i < 100; i++) {
            performOperation(buffer, 0);
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            performOperation(buffer, 2);
        }
        long endTime = System.nanoTime();
        double duration = (double) (endTime - startTime) / 1_000_000.0;
        System.out.println("DELETE) " + bufferType + ": " + duration + " мс");
    }

    private static void performOperation(TextBuffer buffer, int operationType) {
        String randomText = generateRandomText(TEXT_LENGTH);
        int position;
        int start, end;

        switch (operationType) {
            case 0: // Insert
                position = random.nextInt(buffer.getText().length() + 1);
                buffer.insert(position, randomText);
                break;
            case 1: // Append
                buffer.append(randomText);
                break;
            case 2: // Delete
                if (!buffer.getText().isEmpty()) {
                    start = random.nextInt(buffer.getText().length());
                    end = Math.min(start + random.nextInt(TEXT_LENGTH), buffer.getText().length());
                    buffer.delete(start, end);
                }
                break;
        }
    }

    private static void performRandomOperation(TextBuffer buffer) {
        int operationType = random.nextInt(3); // 0: insert, 1: append, 2: delete
        performOperation(buffer, operationType);
    }

    private static String generateRandomText(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append((char) (random.nextInt(26) + 'a'));
        }
        return sb.toString();
    }
}
