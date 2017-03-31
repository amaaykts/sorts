/**
 * Класс для быстрой сортировки
 */
public class QuickSort {
    /**
     * Метод сортировки массива
     *
     * @param array массив который нужно отсортировать
     * @return отсортированный массив
     */
    public static int[] sort(int[] array) {
        recur(0, array.length - 1, array);
        return array;
    }

    /**
     * Метод для быстрой сортировки
     *
     * @param i     левая граница массива
     * @param j     правая граница массива
     * @param array массив для сортировки
     */
    private static void recur(int i, int j, int[] array) {
        int basic = array[(i + j) / 2]; //опорный
        int left = i;   //левый курсор
        int right = j;  //правй курсор

        while (left < right) {
            while (array[left] < basic) left++; //до тех пор пока удовлетворяет условию пускай двигает курсор
            while (array[right] > basic) right--;   //до тех пор пока удовлетворяет условию пускай двигает курсор
            if (left <= right) {    //если курсоры ещё не поменялись местами
                swap(left, right, array);   //меняем элементы местами
                left++;
                right--;
            }
        }
        if (left < j) recur(left, j, array);   //вызываем для правой части
        if (right > i) recur(i, right, array); //вызываем для левой части

    }

    /**
     * Меняем местами элементы
     *
     * @param i     какой элемент меняем
     * @param j     с каким элементом меняем
     * @param array массив в котором меняем
     */
    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
