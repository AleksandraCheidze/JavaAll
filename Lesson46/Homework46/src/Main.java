import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  //Вам дан словарь, состоящий из пар слов. Каждое слово является синонимом к парному ему слову. Все слова в словаре различны.
  //Для слова из словаря, записанного в последней строке, определите его синоним.
  //Формат ввода
  //в первой строке - количество записей в словаре
  //в следующих строках - сами записи: первое слово (ключ) и второе слово (синоним), каждое слово в отдельной строке
  //в последней строке - слово, синоним для которого нужно вывести

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите количество записей в словаре: ");
    while (!scanner.hasNextInt()) {
      String error = scanner.nextLine();
      System.out.println("Некорректный ввод, введите целое число: '" + error + "'");
      System.out.print("Введите количество слов: ");
    }
    int amount = scanner.nextInt();
    scanner.nextLine();
    if (amount < 1) {
      System.out.println("У вас нет слов.");
      return;
    }
    Map<String, String> synonyms = new HashMap<>();
    System.out.println("Введите пары слов (слово, его синоним), каждое с новой строки: ");
    for (int i = 0; i < amount; i++) {
      String wordMain = scanner.nextLine();
      String synonym = scanner.nextLine();
      while (wordMain.isEmpty()) {
        System.out.print("Слово не может быть пустым, введите слово: ");
        wordMain = scanner.nextLine();
      }
      synonyms.put(wordMain, synonym);
      synonyms.put(synonym, wordMain);
    }
    System.out.print("Введите слово, для которого нужно найти синоним: ");
    String word = scanner.nextLine();
    if (synonyms.containsKey(word)) {
      String synonym = synonyms.get(word);
      System.out.println("Синоним слова '" + word + "' - это '" + synonym + "'.");
    } else {
      System.out.println("Синоним для слова '" + word + "' не найден.");
    }
  }
}