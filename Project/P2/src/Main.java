import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    HashMap<String, Double> exchangeRates = new HashMap<>();
    ArrayList<String> currencies = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    boolean isRun = true;
    double value;

    exchangeRates.put("USD", 1.00);
    exchangeRates.put("EUR", 0.85);
    exchangeRates.put("GBP", 0.72);
    exchangeRates.put("UAH", 40.46);
    exchangeRates.put("JPY", 147.68);

    while (isRun) {
      printMenu();
      int command = scanner.nextInt();
      scanner.nextLine();
      switch (command) {
        case 1:
          printCurrency(exchangeRates);
          break;
        case 2:

          convertCurrency(scanner, exchangeRates);
          break;
        case 3:
        case 4:
          addCurrency(scanner, exchangeRates);
        case 5:
          removeCurrency(scanner, exchangeRates);

        case 0:
          isRun = false;
          break;
      }
    }
  }

  private static void printMenu() {
    System.out.println("Currency Converter ComersBank:");
    System.out.println("1." + " Посмотреть список валют и их курс для обмена");
    System.out.println("2." + " Обмен валюты");
    System.err.println("3." + " Права Администратора");
    System.err.println("4." + " Добавить новую валюту");

    System.out.println("0." + " Выход из системы");
  }

  private static void printCurrency(HashMap<String, Double> exchangeRates) {

    System.out.println("Курс по отношению к доллару");
    for (Map.Entry<String, Double> pair : exchangeRates.entrySet()) {
      System.out.println(pair.getKey() + ": " + pair.getValue());
    }
    System.out.println();
  }

  public static double convertCurrency(Scanner scanner, HashMap<String, Double> exchangeRates) {
    System.out.print("Введите исходную валюту: ");
    String sourceCurrency = scanner.nextLine().toUpperCase();
    System.out.print("Введите конечную валюту: ");
    String targetCurrency = scanner.nextLine().toUpperCase();
    System.out.print("Количество исходной валюты для конвертации: ");
    double amount = scanner.nextDouble();
    double result = amount * exchangeRates.get(sourceCurrency);
    double result1 = result * 1 / exchangeRates.get(targetCurrency);
    System.out.println(String.format("%.2f", result1));
    return amount;
  }

  public static void addCurrency(Scanner scanner, HashMap<String, Double> exchangeRates) {
    System.out.print("Введите название добавляемой валюты: ");
    String newName = scanner.nextLine().toUpperCase();
    if (!exchangeRates.containsKey(newName)) {
      System.out.println("Введите курс валюты ");
      double newValue = scanner.nextDouble();
      scanner.nextLine();
      exchangeRates.put(newName, newValue);
    } else {
      System.out.println("Эта валюта есть в наличии");
    }
  }

  public static void removeCurrency(Scanner scanner, HashMap<String, Double> exchangeRates) {
    System.out.print("Введите название валюты");
    String removeName = scanner.nextLine().toUpperCase();
    if (exchangeRates.containsKey(removeName)) {
      exchangeRates.remove(removeName);
      System.out.println("Валюта " + removeName + " удалена из списка");
    } else {
      System.out.println("Валюты " + removeName + " в списке нет");
    }
  }

  public static void newValueCurrency(Scanner scanner, HashMap<String, Double> exchangeRates) {
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


}
