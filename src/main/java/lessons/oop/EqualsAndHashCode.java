package lessons.oop;

import java.util.Objects;

public class EqualsAndHashCode {
    public String name;
    public int id;

    EqualsAndHashCode(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {

        // checking if both the object references are referring to the same object
        if(this == obj)
            return true;

        // it checks if the argument is of the same type
        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        // type casting of the argument
        EqualsAndHashCode geek = (EqualsAndHashCode) obj;

        return (Objects.equals(geek.name, this.name) && geek.id == this.id);
    }

    @Override
    public int hashCode()
    {
        return this.id;
    }

    public static void main(String[] args) {
        EqualsAndHashCode g1 = new EqualsAndHashCode("aa", 1);
        EqualsAndHashCode g2 = new EqualsAndHashCode("aa", 1);

        if(g1.hashCode() == g2.hashCode()) {
            if(g1.equals(g2))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");

        } else
            System.out.println("Both Objects are not equal. ");
    }
}
