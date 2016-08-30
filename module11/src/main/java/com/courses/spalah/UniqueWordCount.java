package com.courses.spalah;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Artem Uskov on 19.08.2016.
 */
public class UniqueWordCount {

    public static void calculateUniqueWord(String input, FileWriter writer) throws IOException {
        int uniqueCount = 0;
        ArrayList<String> list = CreateWordsList.createArrayList(input);

        for(String word : list) {
            if(Collections.frequency(list, word.toLowerCase()) == 1) {
                uniqueCount++;
            }
        }

        writer.append("Number of unique words - " + Integer.toString(uniqueCount));
        writer.append("\n");
        writer.flush();
        }

    }

