package com.courses.spalah;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Artem Uskov on 19.08.2016.
 */
public class UniqueWordCount2 {

    public static void calculateUniqueWord2(String input, FileWriter writer) throws IOException {
        ArrayList<String> list = CreateWordsList.createArrayList(input);
        HashSet<String> hashList = new HashSet<>();
        HashSet<String> uniqueHashList = new HashSet<>();

        for(String word : list) {
            uniqueHashList.add(word);
        }

        for(String word : list) {
            if(!hashList.add(word)) {
                uniqueHashList.remove(word);
            }
        }

        writer.append("Number of unique words(2) - " + uniqueHashList.size());
        writer.append("\n");
        writer.flush();
        }

    }

