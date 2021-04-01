import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input;
        int countLine = 0;
        do {
            input = scanner.nextInt();
            if (input != 0) {
                countLine++;
            }
        } while (input != 0);
        System.out.println(countLine);
    }
}