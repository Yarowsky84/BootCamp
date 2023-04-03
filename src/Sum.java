import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a number to sum to: ");
        int sumTo = reader.nextInt();

        int sumTotal = 0;
        int i = 1;
        while (i <= sumTo) {
            sumTotal += i;
            i++;
        }
        System.out.print("The sum of numbers from 1 to " + sumTo + " is ");
        for (i = 1; i <= sumTo; i++) {
            if (i == sumTo) {
                System.out.print(i);
            } else {
                System.out.print(i + " + ");
            }
        }
        System.out.print(" = " + sumTotal);
    }
}
    /*This program initializes an integer variable called sumTotal to 0, and asks the user to input a number to sum to and stores the input in the sumTo variable.

        Then, it uses a while loop to iterate from 1 to sumTo. In each iteration, it adds the current iteration number (i) to the sumTotal variable and increments i by 1.

        After exiting the while loop, the program prints out the result of the sum using System.out.println.*/





