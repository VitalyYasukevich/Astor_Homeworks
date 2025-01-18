package by.iba;

import java.util.Comparator;
/*
 * @author: Yasukevich Vitali
 * @since: 18.10.2025
 * */
public class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2){
        return o1 - o2;  // сортировка по возрастанию
        // return o2 - o1;  // сортировка по убыванию
    }



}
