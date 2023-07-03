

public class MyArray {
    // поля

    private int count; // фактическое количество элементов массива
    private int[] array; // ссылка на массив с которым мы работаем

    // конструктор
    public MyArray() {
        this.count = 0;
        // при создании объекта MyArray мы создаем пустой массив на 10 элементов
        this.array = new int[10];
    }

    // метод добавления элемента в массив
    public void add(int element) {
        // проверим, а не переполнен ли уже массив, который мы держим?
        if (count == array.length) {
            System.out.println("Массив переполнен... увеличиваем");
            resize();
        }

        this.array[this.count] = element;
        this.count++;
    }

    private void resize() {
        int[] newArray = new int[array.length + array.length / 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }



    public void remove(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        count--;
    }


    public void printArray() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }

    }



    public void removeLast() {
        count--;
    }

    public int getCount() {
        return count;
    }
    public int [] getArray() {
        return array;

    }
}