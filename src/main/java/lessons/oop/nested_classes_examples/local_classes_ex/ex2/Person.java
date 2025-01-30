package lessons.oop.nested_classes_examples.local_classes_ex.ex2;

public class Person {
    private String name, street, house;

    public Person(String name, String street, String house) {
        this.name = name;
        this.street = street;
        this.house = house;
    }

    private interface AddressContainer {
        String getStreet();
        String getHouse();
    }

    public AddressContainer getAddressContainer() {
        class PersonAddressContainer implements AddressContainer {
            final String street = Person.this.street, house = Person.this.house;

            @Override public String getStreet() {
                return this.street;
            }

            @Override public String getHouse() {
                return this.house;
            }
        }

        return new PersonAddressContainer();
    }

    public static void main(String[] args) {
        Person person = new Person("Nikita", "Sholohova", "17");
        AddressContainer address = person.getAddressContainer();
        System.out.println("Address: street - " + address.getStreet() + ", house - " + address.getHouse());
    }
}
