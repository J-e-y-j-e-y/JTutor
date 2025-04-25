package homework.collections.set.task_6;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

// Источник событий
public class EventSource extends Thread {
    private final String sourceName;
    private final EventAggregator aggregator;
    private volatile boolean generating = true;

    public EventSource(String sourceName, EventAggregator aggregator) {
        this.sourceName = sourceName;
        this.aggregator = aggregator;
    }

    public void stopGenerating() {
        generating = false;
    }

    @Override
    public void run() {
        while (generating) {
            long timestamp = System.currentTimeMillis() + ThreadLocalRandom.current().nextInt(-100, 100); // Имитируем небольшую рассинхронизацию времени
            String id = UUID.randomUUID().toString();
            String data = "Data from " + sourceName;
            Event event = new Event(timestamp, sourceName, id, data);

            aggregator.processEvent(event);

            // Имитируем дубликаты (с небольшой вероятностью)
            if (ThreadLocalRandom.current().nextDouble() < 0.1) {
                // Создадим дубликат события
                Event duplicateEvent = new Event(timestamp, sourceName, id, "Duplicate " + data);
                aggregator.processEvent(duplicateEvent);
            }

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(100, 300)); // Имитируем разную задержку отправки событий
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println(sourceName + " stopped generating events.");
    }
}
