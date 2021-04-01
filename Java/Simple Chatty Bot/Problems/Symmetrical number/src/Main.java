import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int reversedInteger = 0;
        int remainder = 0;
        int originalInteger = input;

        // reversed integer is stored in variable
        while (input != 0) {
            remainder = input % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            input /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }
}
