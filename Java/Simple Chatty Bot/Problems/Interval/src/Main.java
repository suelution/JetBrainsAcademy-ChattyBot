import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        // (−15,12]∪(14,17)∪[19,+∞)
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input > -15 && input <= 12 || input > 14 && input < 17 || input >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}