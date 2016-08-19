package com.courses.spalah;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * @author Ievgen Tararaka
 */
public class TextAnalyzer {
    /**
     * Ваш анализатор текста должен быть тут
     */
    public static void main(String[] args) {
        File fileR = new File("C:\\Tanya\\Java\\Courses\\courses-2-2016\\module11\\src\\main\\resources\\text_sample.txt");
        File fileW = new File("C:\\Tanya\\Java\\Courses\\courses-2-2016\\module11\\src\\main\\resources\\output.txt");
        StringBuilder builder = new StringBuilder();
        try (FileReader reader = new FileReader(fileR)) {
            char[] buffer = new char[(int) fileR.length()];
            reader.read(buffer);
            String str = new String(buffer);
            try (FileWriter writer = new FileWriter(fileW)) {
                builder.append("STATISTIC OF TEXT:\n\n");
                builder.append("Amount of symbols: "+calcCountOfSymbols(str)+"\n");
                builder.append("Amount of words: "+calcCountOfWords(str)+"\n");
                builder.append("Amount of sentences: "+calcCountOfSentences(str)+"\n");
                builder.append("Amount of unique words: "+calcUniqueWords(str)+"\n");
                builder.append("The most frequent words: "+findFrequentWord(str)+"\n");
                builder.append("Length of shortest word: "+calcLengthOfShortestWord(str)+"\n");
                builder.append("Length of longest word: "+calcLengthOfLongestWord(str)+"\n\n");
                builder.append("Statistic of words:\n"+printStatisticOfWords(str)+"\n\n");
                builder.append("Statistic of characters:\n"+printStatisticOfChars(str)+"\n\n");
                writer.write(builder.toString());
                writer.flush();
                System.out.println("File was created!");
            }
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
        String[] strings = stringToArray(str.toLowerCase());
        for (String s : strings) {
            if (uniqueWords.contains(s)) {
                duplicateWords.add(s);
            }
            uniqueWords.add(s);
        }

        uniqueWords.removeAll(duplicateWords);
        return uniqueWords.size();
    }

    private static String findFrequentWord(String str) {
        HashMap<String, Integer> wordsStatistic = statisticOfWords(str);
        String frequentWord = "";
        int count = 0;
        Iterator<Map.Entry<String, Integer>> iterator = wordsStatistic.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() > count) {
                count = pair.getValue();
                frequentWord = pair.getKey();
            }
        }
        return frequentWord;
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

    private static String printStatisticOfWords(String str) {
        StringBuilder builder = new StringBuilder();
        HashMap<String, Integer> words = statisticOfWords(str);
        Iterator<Map.Entry<String, Integer>> iterator = words.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            builder.append(pair.getKey() + " - " + pair.getValue() + " times\n");
        }
        return builder.toString();
    }

    private static String printStatisticOfChars(String str) {
        StringBuilder builder = new StringBuilder();
        HashMap<Character, Integer> words = statisticOfCharacter(str);
        Iterator<Map.Entry<Character, Integer>> iterator = words.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> pair = iterator.next();
            builder.append(pair.getKey() + " - " + pair.getValue() + " times\n");
        }
        return builder.toString();
    }

    private static String[] stringToArray(String str) {
        str = str.replaceAll("\\s", " ");
        str = str.replace('.', ' ');
        str = str.replaceAll(",", " ");
        str = str.replaceAll("  ", " ");
        str = str.replaceAll("  ", " ");
        str = str.replaceAll("  ", " ");
        return str.split(" ");
    }

    private static HashMap<String, Integer> statisticOfWords(String str) {
        String[] strings = stringToArray(str.toLowerCase());
        ArrayList<String> allWords = new ArrayList<>();
        HashSet<String> words = new HashSet<>();
        HashMap<String, Integer> wordsStatistic = new HashMap<>();

        for (String s : strings) {
            allWords.add(s);
            words.add(s);
        }
        int count = 0;
        for (String word : words) {
            for (String wrd : allWords) {
                if (word.equals(wrd)) {
                    count++;
                }
            }
            wordsStatistic.put(word, count);
            count = 0;
        }
        return wordsStatistic;
    }

    private static HashMap<Character, Integer> statisticOfCharacter(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        ArrayList<Character> allChars = new ArrayList<>();
        HashSet<Character> characters = new HashSet<>();
        HashMap<Character, Integer> charsStatistic = new HashMap<>();
        for (Character c : chars) {
            if ((!Character.isWhitespace(c))) {
                allChars.add(c);
                characters.add(c);
            }
        }
        int count = 0;
        for (Character chrs : characters) {
            for (Character ch : allChars) {
                if (chrs.equals(ch)) {
                    count++;
                }
            }
            charsStatistic.put(chrs, count);
            count = 0;
        }
        return charsStatistic;
    }
}
