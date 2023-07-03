//На базе класса MyArray реализовать методы:
//boolean containsAll(MyArray list) - возвращает true, если все элементы списка list содержатся в текущем списке
//void clear() - очищает список
//void set(int index, int element) - заменяет элемент в списке под нужным индексом
//void removeRange(int fromIndex, int toIndex) - удаляет все элементы в заданном диапазоне

public class MyArray {
    
    private int [] elements;// хранилище элементов, это поле, которое будет хранить ссылку на массив
    private  int count; // количество элементов, которые мы положили

    public MyArray(){
        this.elements = new int [10]; // создали массив с 10 пустыми окошками
        this.count = 0;// изначально количество элементов

    }
    public void add (int element){ //element это цифра, которую будем класть в main
        if (count == elements.length){
            resize();
        }//this.elements это сам массив,[count] индекс количества элементов в массиве this.elements
        this.elements[count] = element;//element(цифру из main) кладем под индексом count
        this.count++;//count сначала 0, поэтому первый элемент уходит в начало, каждый след элемент после предыдущего,
        //так как мы написали count++
    }
    public void resize () {
        int[] newArray = new int [elements.length + elements.length / 2 ];
                            //count - количество элементов, которые нужно скопировать
        for (int i = 0; i < count; i++){//выполняется цикл, который копирует элементы из текущего массива elements в новый массив newArray
            newArray[i] = elements[i];//Копирование выполняется путем присваивания значений elements[i] новому массиву newArray[i]
        }
        this.elements = newArray;//присваивается ссылка this.elements на новый массив newArray
    }
    public void remove (int index) {
        if (index <= 0 || index > count) {
            System.out.println("Неверный индекс - " + index);
            return;
        }
        for (int i = index; i < count - 1; i++) {
            elements[i] = elements[i + 1];//текущий элемент array[i] заменяется следующим элементом array[i + 1]

        }
        count--;
    }

        public int get(int index) {
            if (index <= 0 || index > count) {
                System.err.println("Неверный индекс - " + index);
                return -1;
            }

            return elements[index];
        }
       

   public void clear(){ //void clear() - очищает список

        count = 0;
   }
   //boolean containsAll(MyArray list) -
    // возвращает true, если все элементы списка list содержатся в текущем списке
   public boolean containsAll(MyArray list) {
       for (int i = 0; i < list.count; i++) {
           boolean found = false;
           for (int j = 0; j < count; j++) {
               if (list.elements[i]== elements[j]) {
                   found = true;
                   break;
               }
           }
           if (!found) {
               return false;
           }
       }
       return true;
   }
   //void set(int index, int element) - заменяет элемент в списке под нужным индексом
    public void set (int index, int element){
        if (index < 0 || index >= count) {
            System.out.println("Invalid index - " + index);
            return;
        }
        elements[index] = element;
    }


    //void removeRange(int fromIndex, int toIndex) - удаляет все элементы в заданном диапазоне
    public void removeRange(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= count || toIndex < 0 || toIndex >= count) {
            System.out.println("Invalid range - fromIndex: " + fromIndex + ", toIndex: " + toIndex);
            return;
        }
        if (fromIndex > toIndex) {
            System.out.println("Invalid range - fromIndex is greater than toIndex");
            return;
        }
        int rangeLength = toIndex - fromIndex + 1;
        for (int i = fromIndex; i < count - rangeLength; i++) {
            elements[i] = elements[i + rangeLength];
        }
        count = count - rangeLength;
    }











    public int getCount() {
        return count;
    }

    public int[] toArray() {
        // создаю копию массива, но только с нужными элементы
        int[] copy = new int[count];
        // скопирую все элементы из оригинального массива
        for (int i = 0; i < count; i++) {
            copy[i] = elements[i];
        }
        // возвращаем ссылку на копию, а не оригинал
        return copy;
    }
    public void printArray() {
        for (int i = 0; i < count; i++) {
            System.out.println(elements[i]);
        }
}}




