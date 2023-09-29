package ch13.ex16;

import java.util.Arrays;
import java.util.List;

public class Ex16_Main {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("hello", "I see", "You can do it");
        sentences.sort(new WordCountComparator());
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }
}
