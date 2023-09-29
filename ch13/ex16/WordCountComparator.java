package ch13.ex16;


import java.util.Comparator;

public class WordCountComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        int wordCount1 = countWords(str1);
        int wordCount2 = countWords(str2);
        return Integer.compare(wordCount1, wordCount2);
    }

    private int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}


