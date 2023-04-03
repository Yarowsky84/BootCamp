import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter your number= ");
        int num = reader.nextInt();

        if (num % 2 == 0 && num > 0) {
            System.out.println("even");
        } else if (num % 2 != 0 && num > 0) {
            System.out.println("odd");
                } else {
            System.out.println("Negative");
        }
    }
}
// your task: ask user to enter a number
// if number is even, say that the number is even, number % 2 == 0
// if number is odd , say that the number is odd, number % 2 != 0
// if the number is negative, say that it is a negative number