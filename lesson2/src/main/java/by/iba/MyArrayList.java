package by.iba;

import java.util.Comparator;

/*
* @author: Yasukevich Vitali
* @since: 18.10.2025
* */
public class MyArrayList<T> {
    int capacity = 3;  // размерность массива
    Object[] array = new Object[capacity];
    int counter = 0;  // счётчик элементов

    // добавить элемент
    public void add(T element) {
        if (counter == capacity) {
            capacity *= 2;
            Object[] array1 = new Object[capacity];

            for (int i = 0; i < array.length; i++) {
                array1[i] = array[i];
            }
            array = array1;
        }

        array[counter] = element;
        counter++;

        //System.out.println("Счётчик после добавления: " + counter);
        // System.out.println("Размерность массива: " + capacity);
        /*for(Object value : array){
            System.out.print(value + " ");
        }
        System.out.println();*/
    }

    // добавить элемент по индексу
    public void add(int index, T element) {
        if (index > array.length - 1) {
            System.out.println("Данный элемент превышает размерность массива.");
        } else if (index < 0) {
            System.out.println("Индекс не может быть отрицательным.");
        } else {
            array[index] = element;
        }

        /*for (Object value : array) {
            System.out.print(value + " ");
        }
        System.out.println();*/
    }

    // получить элемент
    public Object get(int index) {
        Object value = null;
        if (index > array.length - 1) {
            System.out.println("Данный элемент превышает размерность массива.");
        } else if (index < 0) {
            System.out.println("Индекс не может быть отрицательным.");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    value = array[i];
                }
            }
        }
        return value;
    }

    // удалить элемент
    public void remove(int index) {
        if (index > array.length - 1) {
            System.out.println("Данный элемент превышает размерность массива.");
        } else if (index < 0) {
            System.out.println("Индекс не может быть отрицательным.");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    array[i] = null;
                }
            }
        }
    }

    // очистить всю коллекцию
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        /*for (Object value : array) {
            System.out.print(value + " ");
        }*/
    }

    ;

    // отсортировать коллекцию
    // быстрая сортировка
    public void quickSort(Comparator<T> comparator) {
        // флаг - проверка на null
        boolean isFullArray = true;
        for (Object obj : array) {
            if (obj == null) {
                isFullArray = false;
            }
        }

        if (!isFullArray) {
            System.out.println("Не достаточно элементов в массиве, довавьте ещё.");
            return;
        }


        int leftIndex = 0;  // коретка для прохода слева на право
        int rightIndex = array.length - 1;

        quickSortLogic(comparator, leftIndex, rightIndex);
    }

    private void quickSortLogic(Comparator<T> comparator, int leftIndex, int rightIndex) {
        // завершить, если массив пуст или уже нечего делить (выход из рекурсии)
        if (array.length == 0 || leftIndex >= rightIndex) return;

        // Выбираем опорный элемент
        Object pivot = array[(leftIndex + rightIndex) / 2];
        int leftMarkerIndex = leftIndex;  // коретка для прохода слева на право
        int rightMarkerIndex = rightIndex;  // коретка для прохода справа на лево
        while (leftMarkerIndex <= rightMarkerIndex) {
            // Перекладываем все элементы влево или вправо от опорного элемента
            // двигаем левый маркер слева направо если элемент меньше чем pivot(опорный элемент, что находится по середине)
            while (comparator.compare((T) array[leftMarkerIndex], (T) pivot) < 0) {
                leftMarkerIndex++;
            }
            // двигаем правый маркер если элемент больше чем pivot(опорный элемент, что находится по середине)
            while (comparator.compare((T) array[rightMarkerIndex], (T) pivot) > 0) {
                rightMarkerIndex--;
            }

            // когда слева и справа у нас несоответствие
            // если левый маркер все ещё меньше правого, то нужно менять элементы местами
            // поскольку до этого не отработали два while
            // и чтобы их не потерять, создаём временную переменную swap
            if (leftMarkerIndex <= rightMarkerIndex) {
                Object swap = array[leftMarkerIndex];
                array[leftMarkerIndex] = array[rightMarkerIndex];
                array[rightMarkerIndex] = swap;
                // сдвигаем маркеры, чтобы получить новые границы
                leftMarkerIndex++;
                rightMarkerIndex--;
            }
        }

        // рекурсия для сортировки левой и правой части
        // если у нас есть левый подмассив (от начала до правого маркера пришедшего в середину)
        if (leftIndex < rightMarkerIndex) {
            quickSortLogic(comparator, leftIndex, rightMarkerIndex);
        }
        // если у нас есть правый подмассив (от конца до левого маркера пришедшего в середину)
        if (rightIndex > leftMarkerIndex) {
            quickSortLogic(comparator, leftMarkerIndex, rightIndex);
        }
    }

    // пузырьковая сортировка
    public void bubleSort(Comparator<T> comparator) {
        // флаг - проверка на null
        boolean isFullArray = true;
        for (Object obj : array) {
            if (obj == null) {
                isFullArray = false;
            }
        }

        if (!isFullArray) {
            System.out.println("Не достаточно элементов в массиве, довавьте ещё.");
            return;
        }


        Object temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                //if(array[j -1] > array[j]){
                if (comparator.compare((T) array[j - 1], (T) array[j]) > 0) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


    // показать массив
    public void showArray() {
        for (Object count : array) {
            // System.out.print(count + " ");
            System.out.println(count);
        }

    }


}






















/*abstract class MyArrayList<T> implements List<T> {

    // Внутреннее хранилище элементов
    protected ArrayList<T> internalList = new ArrayList<>();

    // добавить элемент в конец списка
    public void add(T element) {
        internalList.add(element);
    }

    // добавить элемент по индексу
    public void add(int index, T element){
        internalList.add(index, element);
    }

    // получить элемент по индексу
    public T get(int index) {
        return internalList.get(index);
    }

    // удалить элемент по индексу
    public void remove(int index) {
        internalList.remove(index);
    }

    // очистить всю коллекцию
    public void clear() {
        internalList.clear();
    }

    // отсортировать коллекцию
    public void sort(Comparator<T> comparator){

    }



    // Метод для установки элемента по индексу
    public void set(int index, T element) {
        internalList.set(index, element);
    }

    // получить размер списка
    public int size() {
        return internalList.size();
    }

    // проверить наличие элемента в списке
    public boolean contains(T element) {
        return internalList.contains(element);
    }

    // получить массив из списка
    public T[] toArray() {
        return internalList.toArray(new T[internalList.size()]);
    }

    // получить индекс элемента в списке
    public int indexOf(T element) {
        return internalList.indexOf(element);
    }
}*/
