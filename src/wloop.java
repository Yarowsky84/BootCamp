import java.util.Scanner;
public class wloop {
    public static void main(String[] args) {
        int sumTotal = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a number to sum to: ");
        int sumTo = reader.nextInt();

        int i = 1;
        while (i <= sumTo) {
            sumTotal += i;
            i++;
        }

        System.out.println("The sum of the numbers from 1 to " + sumTo + " is: " + sumTotal);
    }
}
// create scanner object


// ask user to enter int number

// save this to a variable called answer, read this as integer

// --- declare variable sumTo , this will be a temporary storage each time you add 2 numbers

// use while loop to display number from 1 to answer

// inside the while loop, calculate the sum = sum + counter

