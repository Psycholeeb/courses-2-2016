package com.courses.spalah;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ievgen Tararaka
 */
public class TextAnalyzer {
    /**
     * Ваш анализатор текста должен быть тут
     */
    public static void main(String[] args) {
        File file = new File("C:\\Tanya\\Java\\Courses\\courses-2-2016\\module11\\src\\main\\resources\\text_sample.txt");
        try (FileReader reader = new FileReader(file)) {
            char[] buffer = new char[(int) file.length()];
            reader.read(buffer);
            String str = new String(buffer);
            System.out.println(calcCountOfSymbols(str));
            System.out.println(calcCountOfWords(str));
            System.out.println(calcCountOfSentences(str));
            System.out.println(calcUniqueWords(str));
            System.out.println(calcLengthOfShortestWord(str));
            System.out.println(calcLengthOfLongestWord(str));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static int calcCountOfSymbols(String str) {
        char[] chars = str.toCharArray();
        int countOfWhiteSpace = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isWhitespace(chars[i])) {
                countOfWhiteSpace++;
            }
        }
        return chars.length - countOfWhiteSpace;
    }

    private static int calcCountOfWords(String str) {
        String[] s = stringToArray(str);
        for (int i = 0; i < s.length ; i++) {
            System.out.println(s[i]);
        }
        return stringToArray(str).length;
    }

    private static int calcCountOfSentences(String str) {
        char[] chars = str.toCharArray();
        int countOfSentences = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.') {
                countOfSentences++;
            }
        }
        return countOfSentences;
    }

    private static int calcUniqueWords(String str) {
        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();
        String[] strings = stringToArray(str);
        for (String s : strings) {
            if (uniqueWords.contains(s)) {
                duplicateWords.add(s);
            }
            uniqueWords.add(s);
        }

        uniqueWords.removeAll(duplicateWords);
        System.out.println(uniqueWords);

        return uniqueWords.size();
    }

    private static int calcLengthOfShortestWord(String str) {
        String[] strings = stringToArray(str);
        String minString = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if (minString.length() > strings[i].length()) {
                minString = strings[i];
            }
        }
        return minString.length();
    }

    private static int calcLengthOfLongestWord(String str) {
        String[] strings = stringToArray(str);
        String maxString = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if (maxString.length() < strings[i].length()) {
                maxString = strings[i];
            }
        }
        return maxString.length();
    }

    private static String[] stringToArray(String str) {
        str = str.replaceAll("\n", " ");
        str = str.replace('.', ' ');
        str = str.replaceAll(",", " ");
        str = str.replaceAll("  ", " ");
        str = str.replaceAll("  ", " ");
        return str.split(" ");
    }
}
