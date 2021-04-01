import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        System.out.println(input.substring(numberA, numberB + 1));
    }
}