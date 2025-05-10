package homework.oop.enum_homework;

import java.sql.Time;
import java.time.LocalTime;

public class Task {
    private String taskDescription;
    private DayOfWeek dayAssigned;
    private LocalTime executionTime;
    private boolean isCompleted;

    public Task(String taskDescription, DayOfWeek dayAssigned, LocalTime executionTime, boolean isCompleted) {
        this.taskDescription = taskDescription;
        this.dayAssigned = dayAssigned;
        this.executionTime = executionTime;
        this.isCompleted = isCompleted;
    }

    @Override
    public String toString() {
        return executionTime + ": " + taskDescription + (isCompleted ? ", завершено" : ", не завершено");
    }
}