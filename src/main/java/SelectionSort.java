/**
 * Класс сортировки выбором
 */
public class SelectionSort {

    /**
     * Метод сортировки массива
     *
     * @param array массив который нужно отсортировать
     * @return отсортированный массив
     */
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {    
            int min = minimalElementIndex(i, array);
            swap(i, min, array);
        }

        return array;
    }

    /**
     * Находим индекс минимального элемента
     *
     * @param from  с какой позиции начинаем
     * @param array в каком массиве начинаем
     * @return индекс минимального элемента
     */
    private static int minimalElementIndex(int from, int[] array) {
        int min = from;  //пусть текущий элемент будет минимальный
        for (int i = from + 1; i < array.length; i++) { //цикл начиная со следующего элемента
            if (array[i] < array[min])  //Если текущий элемент меньше минимального
                min = i;    //теперь это индекс минимального элемента
        }
        return min;
    }

    /**
     * Меняем местами элементы
     *
     * @param i     какой элемент меняем
     * @param j     с каким элементом меняем
     * @param array массив в котором меняем
     */
    private static void swap(int i, int j, int[] array) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
