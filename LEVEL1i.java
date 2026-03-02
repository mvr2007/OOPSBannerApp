// Program to check if a number is divisible by 5
import java.util.Scanner;

class LEVEL1i {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        int number;


        System.out.print("Enter a number: ");
        number = input.nextInt();


        boolean isDivisible = (number % 5 == 0);

        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        input.close();
    }
}