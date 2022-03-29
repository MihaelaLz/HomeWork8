import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double num;
        double num1;
        double result;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your first number:");
        num= scanner.nextDouble();
        System.out.println("Please enter your second number:");
        num1 = scanner.nextDouble();
        result = num-num1;
    if (Math.abs(result)>0){
        System.out.println("They are not equal");
    }else{
        System.out.println("They are equal");
    }




    }
}
