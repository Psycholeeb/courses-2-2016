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
                   int count = 0;
            String[] even = s.split("_");
            for (int i = 0; i < even.length; i++) {
                int ev = Integer.parseInt(even[i]);
                if (ev % 2 == 0) {
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
                   char[] convert = s.toCharArray();
            String result = "";
            for (int i = 0; i < convert.length; i++) {

                if (convert[i] != symbol.charAt(0) || i == 0 || i == convert.length / 2 || i == convert.length - 1) {
                    result = result + String.valueOf(convert[i]);
                }
            }
            return result;
        }

    }

