import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
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
    Map<String, String> dictionary = readDictionaryFromFile("res/dict.txt");

    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите количество поисковых слов: ");
    int m = Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < m; i++) {
      System.out.print("Введите слово для поиска: ");
      String word = scanner.nextLine().toLowerCase();
      if (dictionary.containsKey(word)) {
        System.out.println(dictionary.get(word));
      } else {
        System.out.println("Не найдено");
      }
    }
    scanner.close();
  }

  private static Map<String, String> readDictionaryFromFile(String filname) {
    Map<String, String> dictionary = new HashMap<>();
    Scanner scanner;
    try {
      scanner = new Scanner(new File(filname));
      int n = Integer.parseInt(scanner.nextLine());
      for (int i = 0; i < n; i++) {
        String line = scanner.nextLine();
        String[] parts = line.split(SEPARATOR);
        if (parts.length == 2) {
          String word = parts[0].toLowerCase();
          String definition = parts[1];
          dictionary.put(word, definition);
        }
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден: " + e);
    }
    return dictionary;
  }
}



