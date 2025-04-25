package homework.collections.set.task_6;

public class Event {
    final long timestamp;
    final String source;
    final String id;
    final String data;

    public Event(long timestamp, String source, String id, String data) {
        this.timestamp = timestamp;
        this.source = source;
        this.id = id;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Event{" +
                "timestamp=" + timestamp +
                ", source='" + source + '\'' +
                ", id='" + id + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id.equals(event.id); // Дедупликация по id
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
