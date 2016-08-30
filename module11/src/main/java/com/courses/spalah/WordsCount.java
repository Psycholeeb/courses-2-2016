package com.courses.spalah;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Artem Uskov on 18.08.2016.
 */
public class WordsCount {

    FileWriter writer;

    public WordsCount(FileWriter writer) {
        this.writer = writer;
    }

    public void calculateWords(String input) throws IOException {
        FileReader reader = new FileReader(input);
        Scanner sc = new Scanner(reader);
        int wordCount = 0;
        while(sc.hasNext()) {
            sc.next();
            wordCount++;
        }
        writer.write("Words quantity - " + Integer.toString(wordCount));
        writer.append("\n");
        writer.flush();
    };
}
