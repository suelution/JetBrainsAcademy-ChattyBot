import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        //int input = scanner.nextInt();
        int number = 0;
        boolean ret = true;
        Boolean isAsending = null;

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (isAsending == null) {
                if (input > number) {
                    isAsending = false;
                } else if (input == number) {
                    isAsending = null;
                } else {
                    isAsending = true;
                }
            } else {
                if (isAsending) {
                    if (input <= number && ret) {
                        input = number;
                        ret = true;
                    } else {
                        ret = false;
                    }
                } else {
                    if (input >= number && ret) {
                        input = number;
                        ret = true;
                    } else {
                        ret = false;
                    }
                }
            }
        }
        System.out.println(ret);
    }
}