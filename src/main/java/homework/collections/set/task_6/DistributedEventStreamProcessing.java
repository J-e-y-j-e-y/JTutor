package homework.collections.set.task_6;

import java.util.ArrayList;
import java.util.List;

public class DistributedEventStreamProcessing {
    public static void main(String[] args) throws InterruptedException {
        EventAggregator aggregator = new EventAggregator(500); // Максимальная задержка: 500 мс

        // Создаем несколько источников событий (потоков)
        List<EventSource> sources = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            sources.add(new EventSource("Source-" + i, aggregator));
            sources.get(i).start();
        }

        // Даем потокам поработать какое-то время
        Thread.sleep(5000);

        // Останавливаем потоки
        for (EventSource source : sources) {
            source.stopGenerating();
        }

        // Ждем завершения потоков
        for (EventSource source : sources) {
            source.join();
        }

        // Обрабатываем оставшиеся события
        System.out.println("\nAggregated Events:");
        List<Event> aggregatedEvents = aggregator.getAggregatedEvents(System.currentTimeMillis());
        for (Event event : aggregatedEvents) {
            System.out.println(event);
        }

        // Проверяем, что все события были обработаны
        if (aggregator.getEventCount() > 0) {
            System.out.println("\nSome events were not processed, probably due to being too recent.");
        }
    }
}
