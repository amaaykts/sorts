import java.util.Arrays;
import java.util.Date;
import java.util.Random;


/**
 * Класс для тестирования сортировок
 */
public class SortsDemo {
    public static void main(String[] args) {
        Random r = new Random();    //Класс для генерации случайного числа
        int[] array = new int[10]; //Массив на 10 символов
        for (int i = 0; i < 10; i++) { //Цикл генерации элементов
            array[i] = r.nextInt(150) - r.nextInt(100);  //Случайное число
        }
        System.out.println("array = " + Arrays.toString(array));  //Печатаем исходный массив

        int[] sort = BubbleSort.sort(array);    //Сортируем массив
        System.out.println("Bubble sort = " + Arrays.toString(sort));  //Печатаем отсортированный массив

        sort = SelectionSort.sort(array);   //Сортируем массив
        System.out.println("Selection sort = " + Arrays.toString(sort));  //Печатаем отсортированный массив

        sort = InsertionSort.sort(array);   //Сортируем массив
        System.out.println("Insertion sort = " + Arrays.toString(sort));  //Печатаем отсортированный массив

    }
}
