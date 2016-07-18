package com.courses.spalah;

import java.util.ArrayList;

/**
 * Модифицируйте этот класс(файл)
 *
 * @author Ievgen Tararaka
 */
public class HomeWorkStrings {
    /**
     * Метод должен вернуть количество четных чисел в строке.
     * <p>Например:
     * дана строка - 1_4_8_11_22, ответ - 3
     *
     * @param s строка типа число1_число2_число3_число4
     * @return количество четных числе в строке
     */
    public static int countEvenInString(String s) {
        String arr[] = s.split("_");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Метод должен удалить указанный символ из строки (кроме случая, если
     * символ находится на первой, последней или срединной позиции)
     * <p>Например:
     * данна строка - xabxxxx, символ - x, ответ - xabx
     *
     * @param symbol символ который необходимо удалить
     * @param s      исходная строка
     * @return результирующая строка
     */
    public static String removeSymbolFromString(String symbol, String s) {
        ArrayList<Character> newChar = new ArrayList<Character>();
        char[] chars = s.toCharArray();
        String result = "";

        int mid = 0;
        if (chars.length % 2 != 0) {
            mid = chars.length / 2;
        }
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == symbol.charAt(0)) {
                if (i == 0 || i == mid || i == chars.length - 1) {
                    newChar.add(chars[i]);
                } else continue;
            } else newChar.add(chars[i]);
        }

        for (int i = 0; i < newChar.size(); i++) {
            result += newChar.get(i);
        }

        return result;
    }
}
