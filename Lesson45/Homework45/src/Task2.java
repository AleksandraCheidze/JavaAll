import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task2 {

  //Даны два списка целых чисел. Посчитайте, сколько чисел содержится одновременно
  //как в первом списке, так и во втором.
  //Для каждого списка программе на вход подаётся сначала количество чисел, а затем
  //и сами числа, каждое в новой строке.
  //Используйте множества.
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    List<Integer> numbers1 = Numbers(scanner);
    List<Integer> numbers2 = Numbers(scanner);

    Set<Integer> set1 = new HashSet<>(numbers1);
    Set<Integer> set2 = new HashSet<>(numbers2);

    set1.retainAll(set2);
    int count = set1.size();
    System.out.println("Количество чисел, содержащихся в обоих списках: " + count);
  }

  public static List<Integer> Numbers(Scanner scanner) {
    System.out.println("Введите количество чисел: ");
    int amount = 0;
    try {
      amount = scanner.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Ошибка: введено некорректное значение.");
      return null;
    }
    if (amount <= 0) {
      System.out.println("Ошибка: количество чисел должно быть положительным.");
    }
    List<Integer> numbers = new ArrayList<>();
    System.out.println("Введите " + amount + " чисел, каждое в новой строке: ");
    for (int i = 0; i < amount; i++) {
      int num;
      try {
        num = scanner.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Ошибка: введено некорректное значение.");
        return null;
      }
      numbers.add(num);
    }
    return numbers;
  }
}

