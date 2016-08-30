package com.courses.spalah;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Artem Uskov on 19.08.2016.
 */
public class MostFrequencyWord {

    public static void searchMostFrequencyWord(String input, FileWriter writer) throws IOException {
        String frequencyWord = "";
        ArrayList<String> list = CreateWordsList.createArrayList(input);

        int maxWordFrequency = Collections.frequency(list, list.get(0).toLowerCase());;
        for(String word : list) {
            if(maxWordFrequency < Collections.frequency(list, word.toLowerCase())) {
                maxWordFrequency = Collections.frequency(list, word.toLowerCase());
                frequencyWord = word;
            }
        }

        writer.append("Most frequency word - " + frequencyWord);
        writer.append("\n");
        writer.flush();
        }

    }

