package com.courses.spalah;

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
        int sum = 0;
        String[] nums = s.split("_");
        for (String num : nums) {
            if (Integer.parseInt(num) % 2 == 0)
                sum++;
        }
        return sum;
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
        char[] chars = s.toCharArray();
        StringBuilder result = new StringBuilder();

        int middle = 0;
        if (chars.length % 2 != 0)
            middle = chars.length / 2;

        for (int i = 0; i < chars.length; i++) {
            if (symbol.charAt(0) == chars[i]) {
                if (i == 0 || i == chars.length - 1 || i == middle) {
                    result.append(chars[i]);
                }
            } else
                result.append(chars[i]);
        }
        return result.toString();
    }
}
