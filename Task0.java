import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        int ball=20;

        System.out.println("Please enter players who entered:");
        Scanner scanner = new Scanner(System.in);

        int players = scanner.nextInt();
        int result = ball - players;

        System.out.println("You have"+" "+ result +" "+"balls left.");
        System.out.println("Please enter players who entered:");

        int players2 = scanner.nextInt();
        int result1 = result - players2;

        System.out.println("You have"+" "+ result1 +" "+"balls left.");
        System.out.println("Please enter players who entered:");

        int players3 = scanner.nextInt();
        int result2 = result1 - players3;

        System.out.println("You have"+" "+ result2 +" "+"balls left.");
        System.out.println("Please enter players who entered:");

        int players4 = scanner.nextInt();
        int result3 = result2 + players4;

        System.out.println("You have"+" "+ result3 +" "+"balls left.");
        System.out.println("Please enter players who entered:");

        int players5 = scanner.nextInt();
        int result4 = result3 - players5;

        System.out.println("You have"+" "+ result4 +" "+"balls left.");
        System.out.println("Please enter players who entered:");

        int players6 = scanner.nextInt();
        int result5 = result4 - players6;

        System.out.println("You have"+" "+ result5 +" "+"balls left.");
        System.out.println("Please enter players who entered:");

        int players7 = scanner.nextInt();
        int result6 = result5 + players7 - 2;

        System.out.println("You have"+" "+ result6 +" "+"balls left.");














    }
}
