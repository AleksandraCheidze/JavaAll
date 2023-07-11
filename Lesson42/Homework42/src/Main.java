import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    //прочитать с клавиатуры количество чисел
    //прочитать с клавиатуры сами числа и сохранить их в список
    //вывести только нечётные элементы списка
    Scanner scanner = new Scanner(System.in);
    System.out.print("Insert amount of numbers: ");
    int amount = scanner.nextInt();
    List<Integer> numbers = new ArrayList<>();
    System.out.println("Insert " + amount + " numbers: ");
    for (int i = 0; i < amount; i++) {
      numbers.add(scanner.nextInt());
    }
    System.out.println("Odd numbers:");
    for (int num:numbers) {
      if (num % 2 != 0){
        System.out.println(num);
      }
    }
    }
  }
