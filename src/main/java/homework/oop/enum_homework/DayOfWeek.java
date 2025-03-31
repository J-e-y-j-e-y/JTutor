package homework.oop.enum_homework;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    Wednesday("Среда"),
    Thursday("Четверг"),
    Friday("Пятница"),
    Saturday("Суббота"),
    Sunday("Воскресенье");

    String day;

    DayOfWeek(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return day;
    }
}
