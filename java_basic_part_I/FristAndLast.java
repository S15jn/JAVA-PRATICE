public class FristAndLast {

    public static boolean is10AsLastAndFirst(int arr[]) {
        if (arr[0] == 10 && arr[arr.length - 1] == 10) {
            return true;

        }
        return false;
    }

    public static boolean FristAndLastSame(int arr[]) {
        if (arr[0] == arr[arr.length - 1]) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 50, -20, 0, 30, 40, 60, 10 };
        System.out.println(is10AsLastAndFirst(arr));
        System.out.println(FristAndLastSame(arr));
    }

}
