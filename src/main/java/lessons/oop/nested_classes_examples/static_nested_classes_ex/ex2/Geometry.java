package lessons.oop.nested_classes_examples.static_nested_classes_ex.ex2;

import java.util.ArrayList;
import java.util.List;

public class Geometry {
    private static List<Point> allPoints = new ArrayList<>(); // Хранилище всех созданных точек

    // Вложенный статический класс Point
    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
            Geometry.allPoints.add(this); // Добавляем точку в общее хранилище
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }


        // Вложенный статический класс для вычислений с точками
        public static class PointCalculations {

            // Метод для расчета расстояния между двумя точками
            public static double distance(Point p1, Point p2) {
                int dx = p1.x - p2.x;
                int dy = p1.y - p2.y;
                return Math.sqrt(dx * dx + dy * dy);
            }

            // Метод для поиска средней точки
            public static Point midPoint(Point p1, Point p2){
                int midX = (p1.x + p2.x) / 2;
                int midY = (p1.y + p2.y) / 2;
                return new Point(midX, midY);
            }

        }
    }


    // Метод для вывода всех созданных точек
    public static void printAllPoints() {
        System.out.println("Все созданные точки:");
        for (Point point : allPoints) {
            System.out.println(point);
        }
    }


    public static void main(String[] args) {
        // Создание точек
        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 5);
        Point p3 = new Point(10, 2);

        // Вывод информации о точках
        System.out.println("Точка 1: " + p1);
        System.out.println("Точка 2: " + p2);
        System.out.println("Точка 3: " + p3);

        // Вычисление расстояния между точками
        double distance = Point.PointCalculations.distance(p1, p2);
        System.out.println("Расстояние между " + p1 + " и " + p2 + ": " + distance);

        // Нахождение средней точки между p1 и p2
        Point midPoint = Point.PointCalculations.midPoint(p1, p2);
        System.out.println("Средняя точка между " + p1 + " и " + p2 + ": " + midPoint);

        // Вывод всех точек
        Geometry.printAllPoints();


        // Демонстрация вложенности
        Point.PointCalculations.distance(new Point(0,0), new Point(1,1)); // доступ к вложенному static class без внешнего


    }
}
