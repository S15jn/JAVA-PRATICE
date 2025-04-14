public class RectangleAreaAndPerimeter {
    public static double area(double l, double b) {
        return l * b;
    }

    public static double perimeter(double l, double b) {
        return 2 * (l + b);
    }

    public static void main(String[] args) {
        System.out.println(area(5.5, 8.5));
        System.out.println(perimeter(5.5, 8.5));
    }
}
