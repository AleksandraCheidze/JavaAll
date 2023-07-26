import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  // Напишите программу, которая:
  // прочитает целое число из файла res/in.txt
  // запишет его в файл res/out.txt
  // Воспользуйтесь методом Integer.toBinaryString().
  // Усовершенствуйте задачу 1 так, чтобы путь
  // к входному и выходному файлу она принимала
  // в качестве аргументов командной строки
  public static void main(String[] args) throws IOException {

    Scanner scanner;
    try {
      scanner = new Scanner(new File("res/in.txt"));
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден: " + e.getMessage());
      return;
    }
    int number = scanner.nextInt();
    scanner.close();

    String binary = Integer.toBinaryString(number);

    File output = new File("res/out.txt");
    FileWriter writer;
    try {
      writer = new FileWriter(output);
    } catch (IOException e) {
      System.err.println("Не получилось открыть файл для записи:" + e.getMessage());
      return;
    }
    writer.write(binary);
    writer.close();

    System.out.println("При вызове было указано " + args.length + " аргументов");
    for (String arg : args) {
      System.out.println("Аргумент: " + arg);
    }
  }
}

