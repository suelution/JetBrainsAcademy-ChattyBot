import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer nextEven = scanner.nextInt();


        if (nextEven % 2 == 0) {
            nextEven = nextEven + 2;
        } else {
            nextEven = nextEven + 1;
        }
        System.out.println(nextEven);
    }
}