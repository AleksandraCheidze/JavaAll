import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
  }


  public void printCurrency() {
    for (Map.Entry<String, Double> entry : exchangeRates.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    System.out.println();
  }

  public void numberCurrency() {
    System.out.println("Доступные валюты и их номера:");
    for (int i = 0; i < currencies.size(); i++) {
      int k = i + 1;
      System.out.println(k + ". " + currencies.get(i));
    }
  }

  public static double convertCurrency(String sourceCurrency, String targetCurrency, double amount,
      HashMap<String, Double> exchangeRates) {
    if (exchangeRates.containsKey(sourceCurrency) && exchangeRates.containsKey(targetCurrency)) {
      double sourceRate = exchangeRates.get(sourceCurrency);
      double targetRate = exchangeRates.get(targetCurrency);
      return amount * (targetRate / sourceRate);
    } else {
      System.out.println("Некорректные валюты.");
      return 0;
    }
  }

  public static void selectionCurrency(List<String> currency, HashMap<String, Double> exchangeRates,
      Scanner scanner) {
    System.out.print("Введите исходную валюту: ");
    String sourceCurrency = scanner.nextLine().toUpperCase();
    System.out.print("Введите конечную валюту: ");
    String targetCurrency = scanner.nextLine().toUpperCase();
    System.out.print("Введите сумму: ");
    double amount = scanner.nextDouble();
    scanner.nextLine();

    double result = convertCurrency(sourceCurrency, targetCurrency, amount, exchangeRates);
    System.out.println("Результат: " + result + " " + targetCurrency);
  }


  public void addCurrency(String currency, double value) {
    if (!exchangeRates.containsKey(currency)) {
      exchangeRates.put(currency, value);
      currencies.add(currency);
    }
  }

  public void changeCourse(String currency, double value) {
    if (exchangeRates.containsKey(currency)) {
      exchangeRates.put(currency, value);
    } else {
      System.out.println("Валюта не найдена.");
    }
  }
}