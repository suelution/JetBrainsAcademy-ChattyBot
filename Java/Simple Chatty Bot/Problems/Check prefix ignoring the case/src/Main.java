import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char theFirstChar = input.charAt(0);
        if (theFirstChar == 'J') {
            System.out.println(true);
        } else if (theFirstChar == 'j') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}