import java.util.HashMap;
import java.util.Scanner;

public class User extends CurrencyConverter {

  public void runCurrencyConverter(HashMap<String, Double> exchangeRate) {
    this.exchangeRates = exchangeRate;
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nДобро пожаловать в конвертер валют для пользователя!");
    boolean isRun = true;
    while (isRun) {
      printUserMenu();
      System.out.print("Выберите действие: ");
      int command = scanner.nextInt();
      scanner.nextLine();

      switch (command) {
        case 1:
          printCurrency();
          break;
        case 2:
          numberCurrency();
          selectionCurrency(currencies, exchangeRates, new Scanner(System.in));
          break;
        case 0:
          isRun = false;
          break;
        default:
          System.out.println("Некорректный выбор. Повторите попытку.");
          break;
      }
    }
    System.out.println("Программа завершена. До свидания!");
  }

  private void printUserMenu() {
    System.out.println("\t\t\tМеню пользователя:");
    System.out.println("1. Посмотреть список валют и их курс по состоянию на:");
    System.out.println("2. Конвертировать валюту");
    System.out.println("0. Выход");
  }
}
