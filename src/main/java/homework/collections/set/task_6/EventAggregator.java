package homework.collections.set.task_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

// Агрегатор событий
public class EventAggregator {
    private final LinkedHashSet<Event> events = new LinkedHashSet<>();
    private final long maxOutOfOrderMillis;

    public EventAggregator(long maxOutOfOrderMillis) {
        this.maxOutOfOrderMillis = maxOutOfOrderMillis;
    }

    public synchronized void processEvent(Event event) {
        // переделай
    }

    public synchronized List<Event> getAggregatedEvents(long currentTime) {
        // переделай
        return new ArrayList<>();
    }

    public synchronized int getEventCount() {
        // переделай
        return 0;
    }
}
