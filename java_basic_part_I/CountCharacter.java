public class CountCharacter {
    public static void main(String[] args) {
        String s = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        char[] arr = s.toCharArray();
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;
        for (int i = 0; i < arr.length; i++) {

            if (Character.isDigit(arr[i])) {
                number++;
            } else if (Character.isWhitespace(arr[i])) {
                space++;
            } else if (Character.isLetter(arr[i])) {
                letter++;
            } else

            {
                other++;
            }

        }

        System.out.println("LETTER = " + letter);
        System.out.println("SPACE = " + space);
        System.out.println("NUMBER = " + number);
        System.out.println("OTHER = " + other);
    }
}
