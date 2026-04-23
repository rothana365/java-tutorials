public class Tutorial_05 {
    public static void main(String[] args) {
//        int[] numbers = {100, 200, 300};
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello, World!");
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        int i = 0;
        while (i < 3) {
            System.out.println("I am running: " + i);
            i++;
        }

        int j = 0;
        do {
            System.out.println("I am running: " + j);
            j++;
        } while (j < 3);

        int[] number = {100, 200, 300};

        for (int numbers: number) {
            System.out.println(numbers);
        }

        for (int k = 0; k < 3; k++) {
            if (k == 1) {
//                break;
                continue;
            }
            System.out.println(k);
        }

        for (int l = 0; l < 5; l++) {
            for (int m = 0; m < 5; m++) {
                System.out.println(m + " : " + m);
            }
        }
    }
}