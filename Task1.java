import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        float price;
        int size;
        boolean isBlack = true;
        boolean canReturn = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the price of the shoes?");

        price = scanner.nextFloat();

        System.out.println("What size they are?");

        size = scanner.nextInt();

        if ((price <= 150) && (size == 44 || size == 45) && (!isBlack) && (canReturn)) {
            System.out.println("These are my shoes ;) !");
        } else {
            System.out.println("These are not my shoes!");
        }
    }
}

