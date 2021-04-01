import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int highest = 0;
        int input;
        do {
            input = scanner.nextInt();
            if (input > highest) {
                highest = input;
            }
        } while (input != 0);
        System.out.println(highest);
    }
}