public class AverageThreeNumber {
    public static double average(int a, int b, int c){
        int sum=a+b+c;
        double avg= sum/3;
        return avg;
    }
    public static void main(String[] args) {
        System.out.println(average(10, 20, 30));
    }

}
