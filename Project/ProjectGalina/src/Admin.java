import java.util.HashMap;
import java.util.Scanner;

public class Admin extends CurrencyConverter {

  public void runCurrencyConverter(HashMap<String, Double> exchangeRate) {
    this.exchangeRates = exchangeRate;
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nДобро пожаловать с правами администратора");
    boolean isRun = true;
    while (isRun) {
      printAdminMenu();
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
        case 3:
          addCurrency(currency, value);
          break;
        case 4:
          break;
        case 5:
          changeCourse(currency, value);
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

  private void printAdminMenu() {
    System.out.println("\t\t\tМеню администратора:");
    System.out.println("1. Список валют и курс по состоянию на:");
    System.out.println("2. Конвертировать валюту");
    System.out.println("3. Добавить валюту");
    System.out.println("4. Удалить валюту");
    System.out.println("5. Изменить курс");
    System.out.println("0. Выход");
  }
}
