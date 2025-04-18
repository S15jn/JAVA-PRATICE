public class DistanceBetweentwoPoints {
    public static void main(String[] args) {
        double x1 = 25;
        double y1 = 35;
        double x2 = 52.5;
        double y2 = 25.5;
        double r = 6371.01;

        double d = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println(d);

    }
}
