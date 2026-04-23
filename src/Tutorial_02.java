public class Tutorial_02 {
    public static void main(String[] args) {
        // String
        String str1 = "Hello";
        String message = "Hello";
        String str2 = new String("Hello");
        String str3 = new String("Hello");
        System.out.println(str1 == message);
        System.out.println(str2 == str3);

        String str4 = "Hello";
        String str5 = "World";
        String messages = str4 + " " + str5;
        System.out.println(messages);
        System.out.println(str4.charAt(0));
        System.out.println(str4.length());
        System.out.println(str4.equals(str5));
        System.out.println(str4.toLowerCase());
        System.out.println(str4.toUpperCase());
        System.out.println(str4.replace('H', 'M'));

        // Array
        int[] numbers = {123, 44, 80, 90, 95};
        System.out.println(numbers[1]);
        numbers[1] = 100;
        System.out.println(numbers[1]);
        System.out.println(numbers.length);
    }
}