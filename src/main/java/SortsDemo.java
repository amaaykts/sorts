import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Random;


/**
 * Класс для тестирования сортировок
 */
public class SortsDemo {
    public static void main(String[] args) {
        int[] array = new int[5]; //Массив на 10 символов
        generateArray(array);
        int[] arrayBuble = Arrays.copyOf(array, array.length);
        int[] arraySelection = Arrays.copyOf(array, array.length);
        int[] arrayInsertion = Arrays.copyOf(array, array.length);
        int[] arrayQuick = Arrays.copyOf(array, array.length);
        int[] arrayMerge = Arrays.copyOf(array, array.length);

        System.out.println("array = " + Arrays.toString(array));  //Печатаем исходный массив

        int[] sort = BubbleSort.sort(arrayBuble);    //Сортируем массив
        System.out.println("Bubble sort = " + Arrays.toString(sort));  //Печатаем отсортированный массив

        sort = SelectionSort.sort(arraySelection);   //Сортируем массив
        System.out.println("Selection sort = " + Arrays.toString(sort));  //Печатаем отсортированный массив

        sort = InsertionSort.sort(arrayInsertion);   //Сортируем массив
        System.out.println("Insertion sort = " + Arrays.toString(sort));  //Печатаем отсортированный массив

        sort = QuickSort.sort(arrayQuick);   //Сортируем массив
        System.out.println("Quick sort = " + Arrays.toString(sort));  //Печатаем отсортированный массив

        sort = MergeSort.sort(arrayMerge);   //Сортируем массив
        System.out.println("Merge sort = " + Arrays.toString(sort));  //Печатаем отсортированный массив

    }

    private static void generateArray(int[] array){
        Random r = new Random();    //Класс для генерации случайного числа
        for (int i = 0; i < array.length; i++) { //Цикл генерации элементов
            array[i] = r.nextInt(150) - r.nextInt(100);  //Случайное число
        }
    }
}
