import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Task1 {
  //Напишите программу, которая получает на вход:
//размер списка имён
//список имён
//номер имени, которое надо вывести
//И выводит соответствующее имя или сообщение об ошибке при некорректном вводе.
//Сообщение об ошибке надо вывести через try-catch, самостоятельно проверять ввод
// на корректность номера не нужно.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите количество имён: ");
    int amount = scanner.nextInt();
    scanner.nextLine();
    List<String> names = new ArrayList<>();
    System.out.println("Введите " + amount + " имён, каждое с новой строки:");
    for (int i = 0; i < amount; ++i) {
      names.add(scanner.nextLine());
    }
    System.out.println("Введите номер имени, которое хотите вывести: ");
    try {
      int nameNumber = scanner.nextInt();
      scanner.nextLine();
      int iToGet = nameNumber - 1;
      System.out.println("Имя под номером " + nameNumber + ": " + names.get(iToGet));
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Некорректный номер имени: " + e.getMessage());
    } catch (InputMismatchException e) {
      System.out.println("Некорректный ввод, введите целое число");
    }
    }
  }
