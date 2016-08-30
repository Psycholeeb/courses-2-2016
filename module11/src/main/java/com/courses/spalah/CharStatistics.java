package com.courses.spalah;

import sun.misc.IOUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Artem Uskov on 22.08.2016.
 */
public class CharStatistics {

    public static void charStatistics(String input, FileWriter writer) throws IOException {
        //String str = String.join("\n", Files.readAllLines(Paths.get(input)));
        String str = new String(Files.readAllBytes(Paths.get(input)));
        char[] charlist = str.toLowerCase().toCharArray();
        HashSet<Character> chars = new HashSet<Character>();
        HashMap<Character, Integer> charStat = new HashMap<>();
        int count = 0;

        for(char singlechar : charlist) {
            if(singlechar != ' ' & singlechar != '\n')
            chars.add(singlechar);
        }

        for(Character uniqChar : chars) {
            for(char ch : charlist) {
                if(uniqChar.equals(ch)) {
                    count++;
                }
            }
            charStat.put(uniqChar, count);
            count = 0;
        }

        writer.append("Character statistics:");
        writer.append("\n");
        writer.append(charStat.toString());
        writer.append("\n");
        writer.flush();
        writer.close();
    }
}
