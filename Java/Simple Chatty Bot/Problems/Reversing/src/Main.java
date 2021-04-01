import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Integer digit = scanner.nextInt();
        int hundred = digit / 100;
        int ten = (digit - (hundred * 100)) / 10;
        int one = (digit - (hundred * 100)) - (ten * 10);

        if (one == 0) {
            System.out.println(ten * 10 + hundred);
        } else {
            System.out.println(one * 100 + ten * 10 + hundred);
        }
    }
}