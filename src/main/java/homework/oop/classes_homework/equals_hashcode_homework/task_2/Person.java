package homework.oop.classes_homework.equals_hashcode_homework.task_2;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    public Person(Address address, String lastName, String firstName) {
        this.address = address;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, address);
    }


}
