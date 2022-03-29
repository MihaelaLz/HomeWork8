import java.util.Scanner;

public class Task4v2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input an alphabet:");;
        String input = scanner.nextLine();

        boolean vowels = input.equalsIgnoreCase("a")
                || input.equalsIgnoreCase("e")
                || input.equalsIgnoreCase("i")
                || input.equalsIgnoreCase("o")
                || input.equalsIgnoreCase("u");

        if (input.isEmpty() || input.length() > 1)
        {
            System.out.println("Error!. EMPTY!");
        }
        else if (!input.matches("[a-zA-Z]+")){
            System.out.println("Error!. Not a letter!");
        }
        else if (vowels){
            System.out.println("Input letter is Vowel!");
        }
        else{
            System.out.println("Input letter is Consonant!");
        }

    }
}
