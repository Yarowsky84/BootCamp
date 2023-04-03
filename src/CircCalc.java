public class CircCalc {
    public static void main(String[] args) {
        double circleRadius = 12.0;
        double PI = 3.14;
        double circleDiameter = 2 * circleRadius;
        double circleCircumference = 2 * PI * circleRadius;
        double circleArea = PI * circleRadius * circleRadius;
        System.out.println("Circle radius: " + circleRadius);
        System.out.println("Circle diameter: " + circleDiameter);
        System.out.println("Circle circumference: " + circleCircumference);
        System.out.println("Circle area: " + circleArea);
    }
}
