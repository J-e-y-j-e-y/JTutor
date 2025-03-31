package homework.oop.classes_homework.equals_hashcode_homework.task_2;

public class TestPerson {
    public static void main(String[] args) {
        String s1 = "Дзержинского";
        String s2 = new String("дзержинского");
        Adress adress1 = new Adress(s1, "Енакиево", "350450");
        Adress adress2 = new Adress("Интернациональная", "Горловка", "324350");
        Adress adress3 = new Adress(s2, "Енакиево", "350450");

        Person person1 = new Person("Petr", "Petrov", adress1);
        Person person2 = new Person("Ivan", "Ivanov", adress2);
        Person person3 = new Person("Petr", "Petrov", adress3);

        if (adress1.equals(adress2)) {
            System.out.println("adress1 равен adress2");
            System.out.println("Хэш-код adress1 = " + adress1.hashCode() + "\n" + "Хэш-код adress2 = " + adress2.hashCode());
        } else {
            System.out.println("adress1 НЕ равен adress2");
            System.out.println("Хэш-код adress1 = " + adress1.hashCode() + "\n" + "Хэш-код adress2 = " + adress2.hashCode());
        }

        System.out.println("НО");

        if (adress1.equals(adress3)) {
            System.out.println("adress1 равен adress3");
            System.out.println("Хэш-код adress1 = " + adress1.hashCode() + "\n" + "Хэш-код adress3 = " + adress3.hashCode());
        } else {
            System.out.println("adress1 НЕ равен adress3");
            System.out.println("Хэш-код adress1 = " + adress1.hashCode() + "\n" + "Хэш-код adress3 = " + adress3.hashCode());
        }

        System.out.println("\n############################\n");

        if (person1.equals(person2)) {
            System.out.println("person1 равен person2");
            System.out.println("Хэш-код person1 = " + person1.hashCode() + "\n" + "Хэш-код person2 = " + person2.hashCode());
        } else {
            System.out.println("person1 НЕ равен person2");
            System.out.println("Хэш-код person1 = " + person1.hashCode() + "\n" + "Хэш-код person2 = " + person2.hashCode());

        }

        System.out.println("НО");

        if (person1.equals(person3)) {
            System.out.println("person1 равен person3");
            System.out.println("Хэш-код person1 = " + person1.hashCode() + "\n" + "Хэш-код person3 = " + person3.hashCode());
        } else {
            System.out.println("person1 НЕ равен person3");
            System.out.println("Хэш-код person1 = " + person1.hashCode() + "\n" + "Хэш-код person3 = " + person3.hashCode());
        }
    }
}
