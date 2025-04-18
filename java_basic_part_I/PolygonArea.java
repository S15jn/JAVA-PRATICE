public class PolygonArea {
    public static void main(String[] args) {
        int n = 7;
        int s = 6;
        double area = (n * s * s) / (4 * Math.tan(Math.PI / n));
        System.out.println(area);
    }
}
