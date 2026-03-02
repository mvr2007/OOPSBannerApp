// Program to check if first number is smallest
import java.util.Scanner;

class LEVEL1ii {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2, number3;


        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        System.out.print("Enter third number: ");
        number3 = input.nextInt();

        boolean isFirstSmallest = (number1 <= number2 && number1 <= number3);

        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        input.close();
    }
}