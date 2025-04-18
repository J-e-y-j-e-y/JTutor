package homework.oop.enum_homework;

public class Task {
    private String taskDescription;
    private DayOfWeek taskAssignmentDay;
    private int timeCompleteTask;
    private String taskCompletionFlag;

    public Task(String taskDescription, DayOfWeek taskAssignmentDay, int timeCompleteTask, String taskCompletionFlag) {
        this.taskDescription = taskDescription;
        this.taskAssignmentDay = taskAssignmentDay;
        this.timeCompleteTask = timeCompleteTask;
        this.taskCompletionFlag = taskCompletionFlag;
    }

    public DayOfWeek getTaskAssignmentDay() {
        return taskAssignmentDay;
    }

    @Override
    public String toString() {
        return taskDescription + " | " + timeCompleteTask + "мин." + " | " + "статус выполнения: " + taskCompletionFlag;
    }
}
