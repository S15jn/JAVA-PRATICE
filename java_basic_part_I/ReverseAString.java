public class ReverseAString {
    public static void main(String[] args) {
        String s = "abcd";
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        String rev = new String(arr);
        System.out.println(rev);

    }
}
