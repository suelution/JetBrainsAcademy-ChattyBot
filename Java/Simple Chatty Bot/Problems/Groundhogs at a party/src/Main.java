import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int peanutCup = scanner.nextInt();
        boolean isWeekEnd = scanner.nextBoolean();

        boolean isWeekEndParty = isWeekEnd && peanutCup >= 15 && peanutCup <= 25;
        boolean isWeekParty = !isWeekEnd && peanutCup >= 10 && peanutCup <= 20;

        System.out.println(isWeekParty || isWeekEndParty);
    }
}