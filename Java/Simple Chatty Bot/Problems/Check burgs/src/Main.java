import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean endsWith = input.endsWith("burg");
        System.out.println(endsWith);
    }
}