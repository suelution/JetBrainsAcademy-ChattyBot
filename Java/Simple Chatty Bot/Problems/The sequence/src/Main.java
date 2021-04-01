import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 0;
        int higest = 0;

        while (i < input) {
            int divByFour = scanner.nextInt();
            if (divByFour % 4 == 0 && divByFour > higest) {
                higest = divByFour;
            }
            i++;
        }
        System.out.println(higest);
    }
}
