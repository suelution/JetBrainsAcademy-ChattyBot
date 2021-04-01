import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            int num = scanner.nextInt();
            if (num % 6 == 0) {
                sum = sum + num;
            }
        }
        System.out.println(sum);
    }
}