import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  // Программисты, как вы уже знаете, постоянно учатся, а в общении между собой используют весьма
  // специфический язык. Чтобы систематизировать ваш пополняющийся профессиональный лексикон, мы
  // придумали эту задачу.
  // Напишите программу создания небольшого словаря сленговых программерских выражений, чтобы она
  // потом по запросу возвращала значения из этого словаря.
  // Файл `dict.txt`
  // В первой строке задано одно целое число `n` — количество слов в словаре.
  // В следующих `n` строках записаны слова и их определения, разделенные двоеточием и символом
  // пробела.
  // Для каждого слова, независимо от регистра символов, если оно присутствует в словаре,
  // необходимо вывести на экран его определение.
  // Если слова в словаре нет, программа должна вывести "Не найдено", без кавычек.

  private static final String SEPARATOR = ": ";

  public static void main(String[] args) {
    // Чтение словаря из файла
    Map<String, String> dictionary = readDictionaryFromFile("res/dict.txt");

    // Ввод количества поисковых слов
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите количество поисковых слов: ");
    int m = Integer.parseInt(scanner.nextLine());

    // Поиск и вывод определения для каждого слова
    for (int i = 0; i < m; i++) {
      System.out.print("Введите слово для поиска: ");
      String word = scanner.nextLine()
          .toLowerCase(); // Приводим слово к нижнему регистру для независимого поиска
      if (dictionary.containsKey(word)) {
        System.out.println(dictionary.get(word));
      } else {
        System.out.println("Не найдено");
      }
    }
    scanner.close(); // Don't forget to close the scanner after use
  }

  private static Map<String, String> readDictionaryFromFile(String filename) {
    Map<String, String> dictionary = new HashMap<>();
    Scanner scanner;
    try {
      scanner = new Scanner(new File("res/dict.txt"));
      int n = Integer.parseInt(scanner.nextLine()); // Считываем количество слов в словаре
      for (int i = 0; i < n; i++) {
        String line = scanner.nextLine();
        String[] parts = line.split(
            SEPARATOR); // Разделяем строку на слово и определение с помощью сепаратора
        if (parts.length == 2) {
          String word = parts[0].toLowerCase(); // Приводим слово к нижнему регистру для независимого поиска
          String definition = parts[1];
          dictionary.put(word, definition); // Добавляем слово и его определение в словарь
        }
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден: " + e);
    }
    return dictionary;
  }
}
