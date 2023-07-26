import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

  protected HashMap<String, Double> exchangeRates;
  protected ArrayList<String> currencies;
  protected String currency;
  protected double value;
  protected LocalDate localDate;

  public CurrencyConverter() {
    this.exchangeRates = new HashMap<>();
    this.currencies = new ArrayList<>();
    this.currency = null;
    this.value = 0;
    this.localDate = null;
  }

  public void monitoring(Scanner scanner) {
    System.out.println("\t\tДобро пожаловать!");
    System.out.println("Для входа выберите уровень Вашего доступа");
    System.out.println("1. Пользователь");
    System.out.println("2. Администратор");

    while (!scanner.hasNextInt()) {
      String error = scanner.nextLine();
      System.out.println("Некорректный ввод: " + error
          + " Введите 1 - для пользователя или 2 - для администратора");
      System.out.print("Для входа выберите уровень Вашего доступа");
    }
    int amount = scanner.nextInt();
    scanner.nextLine();
    if (amount == 1) {

      User user = new User();
      user.runCurrencyConverter(exchangeRates);
    } else if (amount == 2) {
      Admin admin = new Admin();
      admin.runCurrencyConverter(exchangeRates);
    } else {
      System.out.println("До встречи!");
    }
  }

  public void printCurrency() {
    for (Map.Entry<String, Double> entry : exchangeRates.entrySet()) {
      System.out.println("\t\t" + entry.getKey() + ": " + entry.getValue());
    }
    System.out.println();
  }

  public static double convertCurrency(Scanner scanner, HashMap<String, Double> exchangeRates) {
    System.out.print("Введите исходную валюту: ");
    String sourceCurrency = scanner.nextLine().toUpperCase();
    System.out.print("Введите конечную валюту: ");
    String targetCurrency = scanner.nextLine().toUpperCase();
    System.out.print("Количество исходной валюты для конвертации: ");
    while (!scanner.hasNextDouble() || !scanner.hasNextInt()) {
      String error = scanner.nextLine();
      System.out.println("Некорректный ввод: " + error + " Введите корректное значение валюты");
      System.out.print("Количество исходной валюты для конвертации: ");
    }
    double amount = scanner.nextDouble();
    double result = amount * exchangeRates.get(targetCurrency);
    double result1 = result * 1 / exchangeRates.get(sourceCurrency);
    System.out.println("Ваш запрос: " + sourceCurrency + " конвертировать в " + targetCurrency);
    System.out.println("Результат по этой операции: " + String.format("%.2f", result1));
    return amount;
  }

  public void addCurrency(Scanner scanner, HashMap<String, Double> exchangeRates) {
    System.out.print("Введите название добавляемой валюты: ");
    String newName = scanner.nextLine().toUpperCase();
    if (!exchangeRates.containsKey(newName)) {
      System.out.println("Введите курс валюты ");
      double newValue = scanner.nextDouble();
      scanner.nextLine();
      exchangeRates.put(newName, newValue);
      System.out.println("Новая валюта успешно добавлена");
      printCurrency();
    } else {
      System.out.println("Эта валюта есть в наличии");
    }
  }

  public void newValueCurrency(Scanner scanner, HashMap<String, Double> exchangeRates) {
    System.out.print("Введите название валюты, для которой нужно обновить курс: ");
    String currencyName = scanner.nextLine().toUpperCase();
    if (exchangeRates.containsKey(currencyName)) {
      System.out.print("Введите новый курс для " + currencyName + ": ");
      double newRate = scanner.nextDouble();
      exchangeRates.put(currencyName, newRate);
      System.out.println("Курс валюты " + currencyName + " успешно обновлен на " + newRate);
    } else {
      System.out.println("Валюты " + currencyName + " нет в списке, чтобы обновить её курс.");
    }
  }

  public void removeCurrency(Scanner scanner, HashMap<String, Double> exchangeRates) {
    System.out.print("Введите название валюты");
    String removeName = scanner.nextLine().toUpperCase();
    if (exchangeRates.containsKey(removeName)) {
      exchangeRates.remove(removeName);
      System.out.println("Валюта " + removeName + " удалена из списка");
    } else {
      System.out.println("Валюты " + removeName + " в списке нет");
    }
  }
}



