import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String areEqual = scanner.nextLine();
        input = input.replace(" ", "");
        areEqual = areEqual.replace(" ", "");
        System.out.println(input.equals(areEqual));
    }
}