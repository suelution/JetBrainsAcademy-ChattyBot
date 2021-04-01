import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Integer input = scanner.nextInt();
        if (input < 10 && input > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}