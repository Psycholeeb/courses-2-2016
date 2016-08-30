package com.courses.spalah;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Artem Uskov on 19.08.2016.
 */
public class MinWordLenght {

    public void calculateMinWordlenght(String input, FileWriter writer) throws IOException {
        int wordLenght = 0;
        ArrayList<String> list = CreateWordsList.createArrayList(input);

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
