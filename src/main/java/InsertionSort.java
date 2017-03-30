/**
 * Класс сортировки вставками
 */
public class InsertionSort {
    /**
     * Метод сортировки
     *
     * @param array массив который необходимо отсортировать
     * @return возвращаем отсортированный массив
     */
    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {    //проходим по всем элементам
            if (array[i] < array[i - 1]) {  //проверяем что текущий элемент меньше предыдущего
                moveElements(array, i); //сдвигаем элементы до нужно позиции
            }
        }

//        второй вариант цикла
//        for (int i = 0; i < array.length - 1; i++) {    //проходим по всем элементам
//            if (array[i] > array[i + 1]) {    //проверяем что текущий элемент больше следующего
//                moveElements(array, i + 1);   //сдвигаем элементы до нужно позиции
//            }
//        }

        return array;
    }

    /**
     * Сдвигаем элементы
     *
     * @param array           массив в котором будут сдвигаться элементы
     * @param currentPosition позиция элемента который нужно поставить на своё место
     */
    private static void moveElements(int array[], int currentPosition) {
        int current = array[currentPosition];  //сохраняем значение во временную переменную
        int k = currentPosition;   //записываем индекс в переменную

        while (k != 0 && (current < array[k - 1])) {    //пока курсор не находится на последней позиции в массиве и пока наш элемент меньше предыдущего
            array[k] = array[k - 1];    //сдвигаем предыдущий вперед
            k--;    //сдвигаем курсор
        }
        array[k] = current; //присваиваем значение нашего элемента
    }
}
