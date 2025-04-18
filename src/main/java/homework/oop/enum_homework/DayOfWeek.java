package homework.oop.enum_homework;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDEY("Воскресенье");

    String day;

    DayOfWeek(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return day;
    }
}
