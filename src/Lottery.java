import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lotteryNumbers = new int[6];

        // Generate 6 random numbers between 1 and 49
        for (int i = 0; i < 6; i++) {
            lotteryNumbers[i] = random.nextInt(49) + 1;
        }

        // Print the lottery numbers
        System.out.print("The lottery numbers are: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(lotteryNumbers[i] + " ");
        }
    }
}