package by.iba;
/*
 * @author: Yasukevich Vitali
 * @since: 18.10.2025
 * */
public class Dog implements Comparable<Dog> {
    public String name;
    public int age;

    @Override
    public int compareTo(Dog o) {
        return age - o.age;
    }
}
