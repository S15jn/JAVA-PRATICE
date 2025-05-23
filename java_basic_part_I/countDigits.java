public class countDigits {

    public static int sumCount(int number) {
        int reversedNumber = 0;
        int sum = 0;
        while (number != 0) {
            int remainder = number % 10;
            sum += remainder;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumCount(35));

    }

}
