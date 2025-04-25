package homework.collections.set.task_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

// Агрегатор событий
public class EventAggregatorEtalon {
    private final LinkedHashSet<Event> events = new LinkedHashSet<>();
    private final long maxOutOfOrderMillis;

    public EventAggregatorEtalon(long maxOutOfOrderMillis) {
        this.maxOutOfOrderMillis = maxOutOfOrderMillis;
    }

    public synchronized void processEvent(Event event) {
        if (events.contains(event)) {
            System.out.println("Duplicate event ignored: " + event.id);
            return; // Игнорируем дубликаты
        }
        events.add(event);
        System.out.println("Event added from " + event.source + ": " + event.id);
    }

    public synchronized List<Event> getAggregatedEvents(long currentTime) {
        List<Event> aggregatedEvents = new ArrayList<>();
        Iterator<Event> iterator = events.iterator();
        while (iterator.hasNext()) {
            Event event = iterator.next();
            if (event.timestamp < currentTime - maxOutOfOrderMillis) {
                aggregatedEvents.add(event);
                iterator.remove(); // Удаляем обработанное событие
            } else {
                break; // Останавливаемся, так как остальные события еще рано обрабатывать
            }
        }
        return aggregatedEvents;
    }

    public synchronized int getEventCount() {
        return events.size();
    }
}
