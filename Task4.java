import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an alphabet:");
        String input =scanner.next().toLowerCase();

        boolean upperCase = input.charAt(0) >= 65 && input.charAt(0) <=90;
        boolean lowerCase = input.charAt(0) >= 97 && input.charAt(0) <=122;

        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") ||
                input.equals("o") || input.equals("u");

        if (input.length() > 1){
            System.out.println("Error! Not a single character.");
        }
        else if (!(upperCase||lowerCase)){
            System.out.println("Error! Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels){
            System.out.println("Input letter is vowel.");
        }
        else
        {
            System.out.println("Input letter is Consonant.");
        }
    }
}
