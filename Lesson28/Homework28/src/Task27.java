import java.util.Arrays;

public class Task27 {
    public static void main(String[] args) {
        //Реализовать класс ArrayUtils
        //В данном классе сделать методы для сортировки массива
        // и поиска в нем значений методом бинарного поиска.
        // Оба метода должны быть статическими.
        // В Main показать работоспособностью

        int [] array = {1, 6, 8, 4, 2, 5, 77,88,99, 8};
        ArrayUtils.arraysSort(array);
        System.out.println(Arrays.toString(array));
        ArrayUtils.selectionSort(array);
        System.out.println(Arrays.toString(array));
        int number = 6;
        int index = ArrayUtils.binarySearch(number, array);
        System.out.println("Индекс числа " + number + ": " + index);
    }
}



