package lessons.oop.work_with_string_examples.ex2_string_builder_buffer;

public class StringBuilderAndBufferEx {
    public static void main(String[] args) {
        workWithBuilder();
        workWithBuffer();
    }

    public static void workWithBuilder() {
        String numbers = "0123456789";

        StringBuilder sb = new StringBuilder(numbers);

        System.out.println(sb.substring(3)); //3456789
        System.out.println(sb.substring(4, 8)); //4567
        System.out.println(sb.replace(3, 5, "ABCDE")); //012ABCDE56789

        sb = new StringBuilder(numbers);
        System.out.println(sb.reverse()); //9876543210
        sb.reverse(); // Вернем изначальный порядок

        sb = new StringBuilder(numbers);
        System.out.println(sb.delete(5, 9)); //012349
        System.out.println(sb.deleteCharAt(1)); //02349
        System.out.println(sb.insert(1, "One")); //0One2349
    }

    public static void workWithBuffer() {
        String numbers = "0123456789";
        StringBuffer sb = new StringBuffer(numbers);

        System.out.println(sb.substring(3)); // 3456789
        System.out.println(sb.substring(4, 8)); // 4567
        System.out.println(sb.replace(3, 5, "ABCDE")); // 012ABCDE56789

        sb = new StringBuffer(numbers);
        System.out.println(sb.reverse()); // 9876543210
        sb.reverse();

        // Вернем изначальный порядок
        sb = new StringBuffer(numbers);
        System.out.println(sb.delete(5, 9)); // 012349
        System.out.println(sb.deleteCharAt(1)); // 02349
        System.out.println(sb.insert(1, "One")); // 0One2349
    }
}
