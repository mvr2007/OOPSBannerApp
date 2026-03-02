// Program to print odd and even numbers up to N
import java.util.Scanner;

class LEVEL2i {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a positive number: ");
        number = input.nextInt();

        if (number > 0) {

            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }

        } else {
            System.out.println("Not a natural number");
        }

        input.close();
    }
}