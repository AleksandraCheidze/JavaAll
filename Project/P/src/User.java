import java.util.Scanner;

public class User extends CurrencyConverter {

  private Scanner scanner;

  public User() {
    super();
    scanner = new Scanner(System.in);
  }

  public void runCurrencyConverter() {
    System.out.println("Добро пожаловать в конвертер валют для пользователя!");
    boolean isRunning = true;
    while (isRunning) {
      System.out.println("\nМеню пользователя:");
      System.out.println("1. Посмотреть список валют");
      System.out.println("2. Конвертировать валюту");
      System.out.println("0. Выход");

      System.out.print("Выберите действие: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          printCurrencyList();
          break;
        case 2:
          System.out.print("Введите исходную валюту: ");
          String sourceCurrency = scanner.nextLine().toUpperCase();
          System.out.print("Введите конечную валюту: ");
          String targetCurrency = scanner.nextLine().toUpperCase();
          System.out.print("Введите сумму: ");
          double amount = scanner.nextDouble();
          scanner.nextLine();

          double result = convertCurrency(sourceCurrency, targetCurrency, amount);
          System.out.println("Результат: " + result + " " + targetCurrency);
          break;
        case 0:
          isRunning = false;
          break;
        default:
          System.out.println("Некорректный выбор. Повторите попытку.");
          break;
      }
    }
    System.out.println("Программа завершена. До свидания!");
  }
}

