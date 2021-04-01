import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long count = 0;
        long smallest = 1; //n

        long input = scanner.nextLong();

        do {
            ++count;
            smallest *= count;
        } while (smallest <= input);
        System.out.println(count);
    }
}