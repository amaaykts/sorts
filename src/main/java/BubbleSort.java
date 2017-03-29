/**
 * Класс сортировки пузырьком
 */
public class BubbleSort {

    /**
     * Метод сортировки массива
     *
     * @param array массив который нужно отсортировать
     * @return отсортированный массив
     */
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1])
                    swap(j, j + 1, array);
            }
        }

        return array;
    }

    /**Меняем местами элементы
     * @param i какой элемент меняем
     * @param j с каким элементом меняем
     * @param array массив в котором меняем*/
    private static void swap(int i, int j, int[] array) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
