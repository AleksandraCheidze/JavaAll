import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

  //Дан размер списка целых чисел, а затем и сам список чисел, каждое число с новой строки.
  //Обработайте ошибки формата ввода NumberFormatException - завершите программу с красивым сообщением об ошибке
  //Определите, сколько в этом списке элементов, которые больше двух своих соседей, и выведите количество таких элементов.
  //Крайние элементы списка никогда не учитываются, поскольку у них недостаточно соседей.

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.println("ВВедите 4 целых числа, каждое с новой строки: ");
    try {
      int size = scanner.nextInt();
      List<Integer> numbers = new ArrayList<>();
      System.out.println("ВВедите с новой строки " + size + "чисел: ");
      for (int i = 0; i < size; i++) {
        numbers.add(scanner.nextInt());
      }
    } catch (NumberFormatException e) {
      System.err.print("Некорректный ввод, введите целое число");
    }
  }
}
