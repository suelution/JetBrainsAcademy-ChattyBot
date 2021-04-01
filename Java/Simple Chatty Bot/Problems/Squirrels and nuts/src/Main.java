import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer squirrels = scanner.nextInt();
        Integer nuts = scanner.nextInt();

        int n = squirrels;
        int k = nuts;
        int ret = 0;

        ret = k % n;

        System.out.println(ret);
    }
}