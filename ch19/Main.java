package ch19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void firstFive(String fileName) throws IOException {
        Files.lines(Path.of(fileName))
                .map(String::trim)
                .filter(line -> !line.isEmpty())
                .limit(5)
                .forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException {
        // Ex13
        firstFive("ch19/provided/constitution.txt");

        // Ex12
        // System.out.println(fourLetterWords("ch19/provided/hamlet.txt"));

        // Ex11
        // System.out.println(theLines("ch19/provided/constitution.txt"));

        // Ex10
        // List<String> words = Arrays.asList("the", "quick", "brown", "fox");
        // String reversedString = glueReverse(words);
        // System.out.println(reversedString);

        // Ex9
        // double[] numbers = {10.0, 20.0, 30.0, 40.0, 50.0};
        // double standardDeviation = stdev(numbers);
        // System.out.format("Standard Deviation: %,.2f", standardDeviation);

        // Ex8
        // String input = "tennessee";
        // String sortedString = toSortedForm(input);
        // System.out.println(sortedString);

        // Ex7
        // String input = "SOO beautiful";
        // int count = countVowels(input);
        // System.out.println("The number of vowels is: " + count);

        // Ex6
        // String input = "go seattle mariners";
        // String result = pigLatin(input);
        // System.out.println(result);

        // Ex5
        // int[] numbers = {5, -1, -3, 20, 47, -10, -8, -4, 0, -6, -6};
        // int count = countNegatives(numbers);
        // System.out.println("The number of negative values is: " + count);

        // Ex4
        // double[] radii = {3.0, 1.0, 7.2, 5.5};
        // double totalArea = totalCircleArea(radii);
        // System.out.println("The total circle area is: " + totalArea);

        // Ex3
        // int[] numbers = {5, -1, 12, 10, 2, 8};
        // int largest = largestEven(numbers);
        // System.out.println("The largest even number is: " + largest);

        // Ex2
        // int[] numbers = {-1, 2, -4, 6, -9};
        // int sum = sumAbsVals(numbers);
        // System.out.println("The sum of absolute values is: " + sum);

        // Ex1
        // int[] numbers = {2, -1, 4, 16};
        // printDoubled(numbers);
    }

    public static long fourLetterWords(String fileName) throws IOException {
        return Files.lines(Path.of(fileName))
                .map(String::trim)
                .filter(word -> word.length() == 4)
                .distinct()
                .count();
    }

    public static long theLines(String fileName) throws IOException {
        return Files.lines(Path.of(fileName))
                .map(String::trim)
                .filter(line -> line.toLowerCase().startsWith("the"))
                .count();
    }

    public static String glueReverse(List<String> words) {
        return words.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    java.util.Collections.reverse(list);
                    return list.stream();
                }))
                .collect(Collectors.joining(""));
    }

    public static double stdev(double[] numbers) {
        double mean = java.util.stream.DoubleStream.of(numbers).average().orElse(0.0);
        double variance = java.util.stream.DoubleStream.of(numbers)
                .map(n -> Math.pow(n - mean, 2))
                .sum() / numbers.length;
        return Math.sqrt(variance);
    }

    public static String toSortedForm(String str) {
        return str.chars()
                .sorted()
                .mapToObj(c -> (char) c)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static int countVowels(String str) {
        return (int) str.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }

    public static String pigLatin(String sentence) {
        return Arrays.stream(sentence.split("\\s+"))
                .map(Main::convertToPigLatin)
                .collect(Collectors.joining(" "));
    }

    private static String convertToPigLatin(String word) {
        if (word.length() == 0) return word;
        return word.substring(1) + "-" + word.charAt(0) + "ay";
    }

    public static int countNegatives(int[] arr) {
        return (int) Arrays.stream(arr)
                .filter(n -> n < 0)
                .count();
    }

    public static double totalCircleArea(double[] radii) {
        return Math.round(
                Arrays.stream(radii)
                        .map(r -> Math.PI * r * r)
                        .sum()
        );
    }

    public static int largestEven(int[] arr) {
        return Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .max()
                .getAsInt();
    }

    public static int sumAbsVals(int[] arr) {
        return Arrays.stream(arr)
                .map(Math::abs)
                .sum();
    }

    public static void printDoubled(int[] arr) {
        Arrays.stream(arr)
                .map(x -> x * 2)
                .forEach(value -> System.out.print(value + " "));
    }


}
