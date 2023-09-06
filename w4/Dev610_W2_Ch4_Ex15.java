package w4;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch4_Ex15 {
    public static void main(String[] args) {
        System.out.println(wordCount("hello"));
        System.out.println(wordCount("how are you?"));
        System.out.println(wordCount(" this string has wide spaces "));
        System.out.println(wordCount(" "));
        System.out.println();
        System.out.println(wordCount02("hello"));
        System.out.println(wordCount02("how are you?"));
        System.out.println(wordCount02(" this string has wide spaces "));
        System.out.println(wordCount02(" "));
    }

    public static int wordCount(String input) {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != ' ') {
                inWord = true;
            } else if (inWord) {
                count++;
                inWord = false;
            }
        }
        if (inWord) {
            count++;
        }
        return count;
    }

    public static int wordCount02(String input) {
        // split("\\s+") to split the string by one or more consecutive space characters.
        String[] words = input.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
