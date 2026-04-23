public class Tutorial_04 {
    public static void main(String[] args) {
        // if, if-else, else, switch
        /*
        int age = 22;
        if (age < 18) {
            System.out.println("you are a minor");
        } else if (age == 18) {
            System.out.println("congratulations, you are a adult!");
        } else {
            System.out.println("You are an adult");
        }
        System.out.println("END OF FILE");
         */
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        String days = "Monday";

        switch (days) {
            case "Sunday":
                System.out.println("It is Sunday!!");
            break;
            case "Monday":
                System.out.println("It is Monday!!");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}