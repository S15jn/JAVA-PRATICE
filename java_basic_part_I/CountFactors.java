public class CountFactors {

    public static int countFact(int n) {
        int counts = 2;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                counts++;
            }

        }
        return counts;
    }

    public static void main(String[] args) {

        System.out.println(countFact(25));
    }
}
