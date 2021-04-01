import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int br = scanner.nextInt();
        int choco = numberA * numberB;
        if (choco > br) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}