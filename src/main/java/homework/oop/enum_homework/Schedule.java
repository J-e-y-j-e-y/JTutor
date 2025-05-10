package homework.oop.enum_homework;

import java.time.LocalTime;
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

    void addTask(DayOfWeek day, Task task) {
        List<Task> daySchedule = schedule.get(day);
        daySchedule.add(task);
    }

    void printSchedule() {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day.toString());
            for (Task s : schedule.get(day)) {
                System.out.println(s);
            }
            ;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Schedule schedule = new Schedule();

        DayOfWeek monday = DayOfWeek.MONDAY;
        Task mondayTask = new Task(
                "дэйли команды",
                DayOfWeek.MONDAY,
                LocalTime.of(11, 00),
                true
        );
        schedule.addTask(monday, mondayTask);

        mondayTask = new Task(
                "регулярная встреча с сопровождением ИС",
                DayOfWeek.MONDAY,
                LocalTime.of(16, 00),
                false
        );
        schedule.addTask(monday, mondayTask);

        DayOfWeek tuesday = DayOfWeek.TUESDAY;
        Task tuesdayTask = new Task(
                "Дэйли команды",
                DayOfWeek.MONDAY,
                LocalTime.of(11, 00),
                false
        );
        schedule.addTask(tuesday, tuesdayTask);

        tuesdayTask = new Task(
                "Разбор тех. долгов, контур ПРОМ",
                DayOfWeek.MONDAY,
                LocalTime.of(17, 00),
                false
        );
        schedule.addTask(tuesday, tuesdayTask);

        schedule.printSchedule();

    }
}
