import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String aToB = scanner.next();
        aToB = aToB.replace("a", "b");
        System.out.println(aToB);
    }
}