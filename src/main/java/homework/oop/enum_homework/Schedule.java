package homework.oop.enum_homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schedule {
    Map<DayOfWeek, List<Task>> schedule = new HashMap<>();

    public Schedule() {
        for(DayOfWeek dayOfWeek : DayOfWeek.values()) {
            schedule.put(dayOfWeek, new ArrayList<>());
        }
    }

    void addTask(Task... newTask) {
        for (Task task : newTask) {
            List<Task> daySchedule = schedule.get(task.getTaskAssignmentDay());
            daySchedule.add(task);
        }
    }

    void printSchedule() {
        System.out.println(schedule);
    }

    public static void main(String[] args) {
        Schedule schedule = new Schedule();
        Task task1 = new Task("Почистить зубы", DayOfWeek.MONDAY,30, "не выполнено");
        Task task2 = new Task("Умыться", DayOfWeek.TUESDAY,30, "не выполнено");
        Task task3 = new Task("Поесть", DayOfWeek.WEDNESDAY,30, "не выполнено");

        Task task4 = new Task("Проспать работу", DayOfWeek.THURSDAY,0, "выполнено");
        Task task5 = new Task("Сходить в магазин", DayOfWeek.FRIDAY,60, "не выполнено");
        Task task6 = new Task("Отремонтировать машину", DayOfWeek.SATURDAY,120, "не выполнено");

        Task task7 = new Task("Приготовить есть", DayOfWeek.SUNDEY,60, "не выполнено");
        Task task8 = new Task("Смотреть телевизор", DayOfWeek.MONDAY,120, "выполнено");
        Task task9 = new Task("Погладить вещи", DayOfWeek.MONDAY,30, "не выполнено");

        schedule.addTask(task1, task2, task3, task4, task5, task6, task7, task8, task9);

        schedule.printSchedule();
    }
}
