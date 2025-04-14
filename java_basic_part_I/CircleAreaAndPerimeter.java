public class CircleAreaAndPerimeter {
    public static double pi = 3.14;

    public static double perimeter(double radius) {
        return 2 * pi * radius;

    }

    public static double area(double radius) {

        return pi * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println(perimeter(7.5));
        System.out.println(area(7.5));
    }
}
