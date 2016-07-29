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

        s = "2_5_6_7_4";
        String[] b = s.split("_");
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            int d = Integer.valueOf(b[i]);
            if (0 == d % 2){
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
     +
     +                if (convert[i] != symbol.charAt(0) || i == 0 || i == convert.length / 2 || i == convert.length - 1) {
     +                    result = result + String.valueOf(convert[i]);
     +                }
     +            }
     +            return result;
     *
     * @param symbol символ который необходимо удалить
     * @param s      исходная строка
     * @return результирующая строка
     */
    public static String removeSymbolFromString(String symbol, String s) {
        s = "abrarttaayuagga";
        symbol = " ";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] != 'a'|| i == 0 || i == c.length / 2 || i == c.length - 1) {
                symbol += c[i];

            }
        }
        return symbol;
    }
}

