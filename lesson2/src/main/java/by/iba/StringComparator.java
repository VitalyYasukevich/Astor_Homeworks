package by.iba;

import java.util.Comparator;
/*
 * @author: Yasukevich Vitali
 * @since: 18.10.2025
 * */
public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
