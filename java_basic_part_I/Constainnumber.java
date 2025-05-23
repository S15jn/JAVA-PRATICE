public class Constainnumber {
    public static boolean checkArray4_Or_7(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 || nums[i] == 7) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7 };
        System.out.println(checkArray4_Or_7(arr));
    }
}
