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
        int countchet = 0;
        String[] strArray = s.split("_");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        for (int j = 0; j < intArray.length; j++) {
            if ((intArray[j] % 2) == 0)
                countchet++;
        }
        return countchet;
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
        char strSymbol = s.charAt(0);
        String cut = "";
        // Поверяем если в строке нечетное кол-во симовлов
        if ((s.length()) % 2 != 0) {
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) == strSymbol) && (i != 0) && (i != s.length() - 1) && (i != (s.length() - 1) / 2)) {
                } else {
                    cut += s.charAt(i);
                }
            }
        } else {
        // Выполняем если четное
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) == strSymbol) && (i != 0) && (i != s.length() - 1)) {
                } else {
                    cut += s.charAt(i);
                }
            }
        }
        return cut;
    }
}
