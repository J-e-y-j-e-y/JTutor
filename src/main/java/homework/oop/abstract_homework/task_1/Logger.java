package homework.oop.abstract_homework.task_1;

public abstract class Logger {
    String messageFormat = "\n%1$tb %1$te, %1$tY %1$tI:%1$tM %1$Tp %s %s";

    abstract void logMessage(String message);
}
