import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int year;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year:");
        year = scanner.nextInt();

        boolean isNotDivisibleOf100 = (year % 100) != 0;
        boolean isDivisibleOf400and100 = ((year % 400 == 0) && (year % 100 == 0));
        boolean isDivisibleOf4 = (year % 4) == 0;

        if (isDivisibleOf4 && (isNotDivisibleOf100 || isDivisibleOf400and100)) {
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }

        }
    }