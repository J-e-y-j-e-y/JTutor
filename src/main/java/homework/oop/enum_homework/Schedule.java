package homework.oop.enum_homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schedule {
    Map<DayOfWeek, List<String>> schedule = new HashMap<>();

    public Schedule() {
        for(DayOfWeek dayOfWeek : DayOfWeek.values()) {
            schedule.put(dayOfWeek, new ArrayList<>());
        }
    }

    void addTask(DayOfWeek day, String task) {
        List<String> daySchedule = schedule.get(day);
        daySchedule.add(task);
    }

    void printSchedule() {
        System.out.println(schedule);
    }

    public static void main(String[] args) {
        Schedule schedule = new Schedule();

        DayOfWeek monday = DayOfWeek.MONDAY;
        String mondayTask = "почистить зубы";
        String mondayTask2 = "почистить картошку";

        schedule.addTask(monday, mondayTask);
        schedule.addTask(monday, mondayTask2);

        schedule.printSchedule();
    }
}
