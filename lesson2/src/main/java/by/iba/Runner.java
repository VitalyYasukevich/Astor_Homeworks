package by.iba;

/*
 * @author: Yasukevich Vitali
 * @since: 18.10.2025
 * */
public class Runner
{
    public static void main( String[] args )
    {
        createInt();
        //createString();

    }

    public static void createString() {
        MyArrayList<String> objectMyArrayList = new MyArrayList<>();
//        objectMyArrayList.add("Hello World");
//        objectMyArrayList.add("I love Java");
//        objectMyArrayList.add("I like sunny day");
//        objectMyArrayList.add("The winter, is a beautiful season!");
//        objectMyArrayList.add("Windows of change");
//        objectMyArrayList.add("My favorite sport is soccer");



        objectMyArrayList.add("1");
        objectMyArrayList.add("666666");
        objectMyArrayList.add("333");
        objectMyArrayList.add("4444");
        objectMyArrayList.add("22");
        objectMyArrayList.add("55555");


        objectMyArrayList.showArray();
        System.out.println("\nОтсортированный массив");
        StringComparator stringComparator = new StringComparator();
        objectMyArrayList.quickSort(stringComparator);
        //objectMyArrayList.bubleSort(stringComparator);
        objectMyArrayList.showArray();
    }

    public static void createInt() {
        MyArrayList<Integer> objectMyArrayList = new MyArrayList<>();
        //objectMyArrayList.add(5);
        //objectMyArrayList.add(6);
        //objectMyArrayList.add(10);
        objectMyArrayList.add(18);
        //objectMyArrayList.add(-15);
        objectMyArrayList.add(16);
        objectMyArrayList.add(-8);
        objectMyArrayList.add(22);
        objectMyArrayList.add(-34);

        //objectMyArrayList.add(3, 15);
        //objectMyArrayList.add(1, 33);
        //objectMyArrayList.add(2, 21);
        //objectMyArrayList.add(0, 11);

        //System.out.println(objectMyArrayList.get(2));
        /*objectMyArrayList.remove(2);
        System.out.println(objectMyArrayList.get(2));*/
        //objectMyArrayList.clear();
        objectMyArrayList.showArray();
        System.out.println("\nОтсортированный массив");

        IntegerComparator integerComparator = new IntegerComparator();
        //objectMyArrayList.quickSort(integerComparator);
        objectMyArrayList.bubleSort(integerComparator);

        objectMyArrayList.showArray();
    }
}
