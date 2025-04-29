package homework.oop.classes_homework.equals_hashcode_homework.task_2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Address addr1 = new Address("110100", "Москва", "Знаменка 12");
        Person p1 = new Person(addr1, "Petrov1", "Ivan1");

        Address addr2 = new Address("110100", "Москва", "Знаменка 12");
        Person p2 = new Person(addr2, "Petrov1", "Ivan1");

        System.out.println("сравнение объектов " + p1.getClass().getSimpleName() + " " + p1.equals(p2));

        System.out.println("сравнение объектов " + addr1.getClass().getSimpleName() + " " + addr1.equals(addr2));

        int p1Hash = p1.hashCode();
        int p2Hash = p2.hashCode();
        System.out.println(p1Hash == p2Hash);

        Map<Person, String> personMap = new HashMap<>();
        personMap.put(p1, p1.getLastName());
        personMap.put(p2, p2.getLastName());

        System.out.println(personMap);


    }
}
