package by.iba;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Homework {
    public static void main(String[] args) {
        // Пример 1
        turnString("I love Java");

        // Пример 2
        // int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        // getDistinctNumbers(ints);

        // Пример 3
        //int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        //findSecondMaxElement(arr);

        // Пример 4
        // String string = "Hello world";  // 5
        //String string = "    fly me    to the moon    ";  // 4
        //lengthOfLastWord(string);

        // Пример 5
        // isPalindrome("abc");
        // abc - false
        // 112233 - false
        // aba - true
        // 112211 - true
    }

    // 1. Перевернуть строку и вывести на консоль
    //  String string = "I love Java";
    public static void turnString(String string) {
        char[] array = string.toCharArray();
        for (int i = array.length -1 ; i >= 0 ; i--) {
            System.out.print(array[i]);
        }
    }

    // 2. Удалить дубликаты из массива и вывести в консоль
    //int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
    public static void getDistinctNumbers(int[] ints) {
        /*Set<Integer> set = new HashSet<>();
        for (int i = 0; i < ints.length; i++) {
            set.add(ints[i]);
        }
        for (Integer item : set) {
            System.out.print(item + " ");
        }*/

        int count1 = 1;
        for (int i = 0; i < ints.length - 1; i++) {
            if(ints[i] != ints[i + 1]){
                count1++;
            }else {
                ints[i] = 12345;
            }
        }

        int [] newInts = new int[count1];
        int count2 = 0;
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] != 12345){
                newInts[count2] = ints[i];
                count2++;
            }
        }

        for (int value : newInts){
            System.out.print(value + " ");
        }
    }

    // 3. Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static Integer findSecondMaxElement(int[] arr) {
        int firstMaxElement = arr[0];
        int secondMaxElement = arr[0];
        for (int value : arr){
            if(value > firstMaxElement){
                firstMaxElement = value;
            }
        }
        //System.out.println(firstMaxElement);
        for(int value : arr){
            if(value > secondMaxElement && value < firstMaxElement){
                secondMaxElement = value;
            }
        }
        System.out.println(secondMaxElement);
        return null;
    }

    // 4. Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static Integer lengthOfLastWord(String string) {
        String[] array = string.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] != " "){
                System.out.println(array[i].length());
                break;
            }
        }
        return null;
    }

    // 5. Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public static boolean isPalindrome(String string) {
        int firstElementIndex = 0;
        int lastElementIndex = string.length() - 1;
        boolean result = true;
        while (firstElementIndex <= lastElementIndex) {
            if (string.charAt(firstElementIndex) != string.charAt(lastElementIndex)) {
                result = false;
                break;
            } else {
                firstElementIndex++;
                lastElementIndex--;
            }
        }
        System.out.println(result);
        return false;
    }
}

