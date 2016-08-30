package com.courses.spalah;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ievgen Tararaka
 */
public class TextAnalyzer {
    //private String INPUT_FILE = "C:\\spalah\\courses-2-2016\\module11\\src\\main\\resources\\text_sample.txt";
    //private static String OUTPUT_FILE = "C:\\spalah\\courses-2-2016\\module11\\src\\main\\resources\\statistics.txt";



    public static void main(String[] args) throws IOException {
        final String INPUT_FILE = "C:\\spalah\\courses-2-2016\\module11\\src\\main\\resources\\text_sample.txt";
        final String OUTPUT_FILE = "C:\\spalah\\courses-2-2016\\module11\\src\\main\\resources\\statistics.txt";
        FileWriter rewriteFile = new FileWriter(OUTPUT_FILE, false);
        FileWriter writer = new FileWriter(OUTPUT_FILE, true);
        TokensCount tokensCounter = new TokensCount();
        WordsCount wordsCounter = new WordsCount(writer);
        SentenceCount sentenceCounter = new SentenceCount();
        MaxWordLenght maxWordLenghtCounter = new MaxWordLenght();
        MinWordLenght minWordLenghtCounter = new MinWordLenght();


        rewriteFile.flush();

        wordsCounter.calculateWords(INPUT_FILE);
        tokensCounter.calculateTokens(INPUT_FILE, writer);
        sentenceCounter.calculateSentense(INPUT_FILE, writer);
        maxWordLenghtCounter.calculateMaxWordlenght(INPUT_FILE, writer);
        minWordLenghtCounter.calculateMinWordlenght(INPUT_FILE, writer);
        UniqueWordCount.calculateUniqueWord(INPUT_FILE, writer);
        UniqueWordCount2.calculateUniqueWord2(INPUT_FILE, writer);
        MostFrequencyWord.searchMostFrequencyWord(INPUT_FILE, writer);
        WordStatistics.wordStatistics(INPUT_FILE, writer);
        CharStatistics.charStatistics(INPUT_FILE, writer);

        System.out.println("Statistics complete");



    }

//    public static String getInputFile() {
//        return INPUT_FILE;
//    }
}
