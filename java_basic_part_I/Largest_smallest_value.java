public class Largest_smallest_value {
    public static int largestNumber(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int smallestNumber(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        System.out.println(largestNumber(a, b));
        System.out.println(smallestNumber(a, b));
    }
}
