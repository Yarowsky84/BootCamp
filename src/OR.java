import java.util.Scanner;
public class OR {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Shoe Colour:");
        String response = reader.nextLine();

        if (response.equals("Black") || response.equals("Brown")) {
            System.out.println("Hell yeah!!");
        } else
                System.out.println("Oh NO!!");
    }
}