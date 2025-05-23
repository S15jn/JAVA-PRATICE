public class ReverseWord {
    public static void reverse(String s) {
        char[] ch = s.toCharArray();
        String result = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        System.out.println("Reverse word: " + result.trim());
    }

    public static void main(String[] args) {
        String s="somya";
        reverse(s);
    }
}
