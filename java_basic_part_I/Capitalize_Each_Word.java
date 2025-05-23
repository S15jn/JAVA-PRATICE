public class Capitalize_Each_Word {

    public static void capWords(String s) {

        System.out.println(s.toUpperCase());
    }

    public static void lowerWords(String s) {
        System.out.println(s.toLowerCase());
    }

    public static String penulimateWord(String s) {

        String[] w = s.split(s);
        return w[w.length - 2];
    }

    public static void main(String[] args) {
        String s = "the quick brown fox jumps over the lazy dog";
        capWords(s);
        lowerWords(s);
        System.out.println(penulimateWord(s));

    }
}
