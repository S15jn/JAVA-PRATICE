public class SwapVariables {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        System.out.println("Before Swap");
        System.out.println(a);
        System.out.println(b);
        System.out.println("After Swap");
        swap(a, b);

    }
}
