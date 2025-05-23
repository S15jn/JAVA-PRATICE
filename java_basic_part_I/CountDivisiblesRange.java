public class CountDivisiblesRange {

    public static int countRange(int x, int y, int p) {
        int count = 0;
        for (int i = x; i <= y; i++) {
            if (i % p == 0) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countRange(5, 20, 3));

    }
}
