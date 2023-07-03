import java.util.Arrays;

public class Task23 {
    //На базе класса MyArray реализовать метод remove(int element)
    //В Task23.java - реализовать main, который выводит count MyArray после удаления в нем элементов.
    //Отправить на проверку: Task23, MyArray

    public static void main(String[] args) {
        MyArray a1 = new MyArray();
        MyArray a2 = new MyArray();


        a1.add(170);
        a1.add(8);
        a1.add(10);
        a1.add(7);
        a1.add(6);
        a1.add(9);




        a2.add (1);
        a2.add (3);
        a2.add (9);


        a1.remove(8);
        a1.add(33);

            



        a1.printArray();



    }
}
