import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Task1 {

  //Написать программу, которая:
  //прочитает с клавиатуры количество чисел
  //прочитает с клавиатуры сами числа и соберёт их в множество
  //выведет полученные результаты на экран
  //Все числа, которые подаются на вход, целые.

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.println("Введите количество чисел: ");
      int amount = scanner.nextInt();
      scanner.nextLine();
      Set<Integer> numbers = new HashSet<>(amount);
      System.out.println("Введите" + " " + amount + " " + "чисел: ");
      for (int i = 0; i < amount; i++) {
        numbers.add(scanner.nextInt());
      }
      System.out.println("Вы ввели числа: " + " " + numbers);
    } catch (InputMismatchException e) {
      System.out.println("Вводите только целые числа");
    }
  }
}