import java.util.Arrays;

/**
 * Класс для сортировки слиянием
 */
public class MergeSort {

    /**
     * Метод сортировки массива
     *
     * @param array массив который нужно отсортировать
     * @return отсортированный массив
     */
    public static int[] sort(int[] array) {
        int length = array.length;
        if (length < 2)
            return array;
        int middle = length / 2;
        int[] arr1 = Arrays.copyOfRange(array, 0, middle);  //копирует часть массива;
        int[] arr2 = Arrays.copyOfRange(array, middle, length); //копирует часть массива;

        return mergeFor(sort(arr1), sort(arr2));    //вызываем метод merge передавая туда вызов функции sort
    }

    /**
     * Метод слияния массивов
     */
    private static int[] mergeFor(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int firstCursor = 0;
        int secondCursor = 0;
        int resultCursor = 0;

        for (int i = 0; i < a.length + b.length; i++) {
            if (firstCursor == a.length) {
                result[resultCursor] = b[secondCursor];
                secondCursor++;
            } else if (secondCursor == b.length) {
                result[resultCursor] = a[firstCursor];
                firstCursor++;
            } else {
                if (a[firstCursor] < b[secondCursor]) { //если первый элемент меньше второго
                    result[resultCursor] = a[firstCursor];
                    firstCursor++;
                } else {
                    result[resultCursor] = b[secondCursor];
                    secondCursor++;
                }
            }
            resultCursor++;
        }
        return result;
    }

    /**
     * Метод слияния массивов
     */
    private static int[] mergeWhile(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int firstCursor = 0;
        int secondCursor = 0;
        int resultCursor = 0;

        while (firstCursor < a.length && secondCursor < b.length) {
            if (a[firstCursor] < b[secondCursor]) { //если первый элемент меньше второго
                result[resultCursor] = a[firstCursor];
                firstCursor++;
            } else {
                result[resultCursor] = b[secondCursor];
                secondCursor++;
            }
            resultCursor++;
        }

        System.arraycopy(a, firstCursor, result, resultCursor, a.length - firstCursor); //Копирование можно делать без проверок достигнут ли конец какого-то из массивов так как копирование элементов из массива длины 0 ни к чему не приведет
        System.arraycopy(b, secondCursor, result, resultCursor, b.length - secondCursor);   //Копирование можно делать без проверок достигнут ли конец какого-то из массивов так как копирование элементов из массива длины 0 ни к чему не приведет

        return result;
    }
}
