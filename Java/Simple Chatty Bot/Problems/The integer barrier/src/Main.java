import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;
        while (true) {
            input = scanner.nextInt();
            if (input == 0) {
                System.out.println(sum);
                break;
            }
            sum = input + sum;
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        }
    }
}