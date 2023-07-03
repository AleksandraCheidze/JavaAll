import java.util.Arrays;

public class ArrayUtils {
    public static void arraysSort(int[] array) {
        Arrays.sort(array);
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static int binarySearch(int number, int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] == number) {
                System.out.println("Число " + number + " найдено!");
                return middle;
            } else if (array[middle] < number) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        System.out.println("Число " + number + " не найдено.");
        return -1;
    }
}