package com.courses.spalah.homework;

import com.courses.spalah.TextAnalyzer;

import java.util.*;

/**
 * @author Ievgen Tararaka
 */
public class WordsPercentageCalculator {
    private List<String> words = new ArrayList<>();

    public static void main(String[] args) {
        WordsPercentageCalculator calculator = new WordsPercentageCalculator();
        calculator.readAllWords();
        Map<String, Float> percentageMap = calculator.getPercentageMap();
        for (Map.Entry<String, Float> entry : percentageMap.entrySet()) {
            System.out.print("Слово " + entry.getKey());
            System.out.println(" составляет " + entry.getValue() + "% от всех слов в тексте");
        }
    }

    /**
     * Метод читает все слова в тексте и сохраняет их в поле класса.
     *
     * @return список слов
     */
    public void readAllWords() {
        List<String> lines = TextAnalyzer.readLines();

        for (String line : lines) {
            String cleanLine = line.replaceAll("\\.", "")
                    .replace(",", "")
                    .replace("-", "")
                    .replace("\n", " ")
                    .trim();
            String[] wordsInLine = cleanLine.split(" ");
            for (String word : wordsInLine) {
                words.add(word);
            }
        }
        //System.out.println("Все слова=" + words);
    }

    /**
     * Метод должен вернуть Map ключем которой является слово, а значением
     * процентное соотношение ко всем словам в тексте.
     *
     * @return Map
     */
    public Map<String, Float> getPercentageMap() {
        HashMap<String, Float> percentageMap = new HashMap<>();
        for(String word : words) {
            if(!percentageMap.containsKey(word.toLowerCase())) {
                percentageMap.put(word.toLowerCase(), 1F);
            }
            else {
                for (Map.Entry<String, Float> entry : percentageMap.entrySet()) {
                    if(entry.getKey().equals(word.toLowerCase())) {
                        percentageMap.put(word.toLowerCase(), entry.getValue() + 1);
                    }
                }
            }
        }
        for (Map.Entry<String, Float> entry : percentageMap.entrySet()) {
            Float f = entry.getValue();
            percentageMap.put(entry.getKey(), f / words.size() * 100);
        }
        return percentageMap;
    }
}
