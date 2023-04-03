public class Calc {
    public static void main(String[] args) {
        double width = 13.5;
        double height = 25.3;

        System.out.println("Width: " + width);
        System.out.println("Height: " + height);

        double perimeter = 2 * (width + height);
        System.out.println("Perimeter: " + perimeter);

        double area = width * height;
        System.out.println("Area: " + area);
    }
}