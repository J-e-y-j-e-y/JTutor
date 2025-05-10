package homework.oop.enum_homework;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    String title;

    DayOfWeek(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title.toUpperCase();
    }
}
