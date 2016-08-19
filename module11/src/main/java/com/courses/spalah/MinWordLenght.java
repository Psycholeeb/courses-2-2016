package com.courses.spalah;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Artem Uskov on 19.08.2016.
 */
public class MinWordLenght {

    public static void calculateMinWordlenght(String input, String output) throws IOException {
        FileWriter writer = new FileWriter(output, true);
        int wordLenght = 0;
        String str = String.join("\n", Files.readAllLines(Paths.get(input)));
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(str.split("\\s")));
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("")) {
                list.remove(i);
            }
            if(list.get(i).endsWith(",") | list.get(i).endsWith(".")) {
                list.set(i, list.get(i).substring(0, list.get(i).length() - 1));
            }
        }
        wordLenght = list.get(0).length();
        for(String word : list) {
            if(word.length() < wordLenght) {
                wordLenght = word.length();
            }
        }

        writer.append("Min lenght of word - " + Integer.toString(wordLenght));
        writer.append("\n");
        writer.flush();
    }
}
