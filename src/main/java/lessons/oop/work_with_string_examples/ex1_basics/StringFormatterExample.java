package lessons.oop.work_with_string_examples.ex1_basics;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StringFormatterExample {
    public static void main(String[] args) {
        String greetings = String.format(
                "Hello %2$s, welcome to %1$s !",
                "Baeldung",
                "Folks");
        //-----------------------------------------------------------------------------------
        Calendar c = new GregorianCalendar(2017, 11, 10);
        String s = String.format("The date is: %tm %1$te,%1$tY", c);
        //-----------------------------------------------------------------------------------

        String s2 = String.format("The correct answer is %s", false);
        s2 = String.format("The correct answer is %b", null);
        s2 = String.format("The correct answer is %B", true);
        //-----------------------------------------------------------------------------------

        String s3 = String.format("The correct answer is %c", 'a');
        System.out.println(s3);
        s3 = String.format("The correct answer is %c", null);
        System.out.println(s3);
        s3 = String.format("The correct answer is %C", 'b');
        System.out.println(s3);
        s3 = String.format("The valid unicode character: %c", 0x0400);
        System.out.println(s3);

        //-----------------------------------------------------------------------------------
        String s4 = String.format("The number 25 in decimal = %d", 25);
        System.out.println(s4);
        s4 = String.format("The number 25 in octal = %o", 25);
        System.out.println(s4);
        s4 = String.format("The number 25 in hexadecimal = %x", 25);
        System.out.println(s4);
        //-----------------------------------------------------------------------------------
        String s5 = String.format("The computerized scientific format of 10000.00 " + "= %e", 10000.00);
        System.out.println(s5);
        String s6 = String.format("The decimal format of 10.019 = %f", 10.019);
        System.out.println(s6);
    }
}
