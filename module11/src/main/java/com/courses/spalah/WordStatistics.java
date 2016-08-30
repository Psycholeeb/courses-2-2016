package com.courses.spalah;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Artem Uskov on 22.08.2016.
 */
public class WordStatistics {

    public static void wordStatistics(String input, FileWriter writer) throws IOException {
        ArrayList<String> list = CreateWordsList.createArrayList(input);
        HashSet<String> words = new HashSet<>(list);
        HashMap<String, Integer> wordStat= new HashMap<>();
        int count = 0;

        for(String word : words) {
            for(String element : list) {
                if(word.equals(element)) {
                    count++;
                }
            }
            wordStat.put(word, count);
            count = 0;
        }

        writer.append("Word statistics:");
        writer.append("\n");
        writer.append(wordStat.toString());
        writer.append("\n");
        writer.flush();
    }

}
