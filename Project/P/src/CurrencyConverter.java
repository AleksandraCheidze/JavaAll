import java.util.ArrayList;
import java.util.HashMap;

public class CurrencyConverter {

  protected HashMap<String, Double> exchangeRates;
  protected ArrayList<String> currencies;

  public CurrencyConverter() {
    exchangeRates = new HashMap<>();
    currencies = new ArrayList<>();
    addCurrency("EUR", 1.0);
    addCurrency("USD", 1.12);
    addCurrency("GBP", 0.86);
    addCurrency("UAH", 41.28);
    addCurrency("JPY", 155.36);
  }

  public void addCurrency(String currencyCode, double exchangeRate) {
    exchangeRates.put(currencyCode, exchangeRate);
    currencies.add(currencyCode);
  }


  public void printCurrencyList() {
    System.out.println("Доступные валюты:");
    for (int i = 0; i < currencies.size(); i++) {
      String currencyCode = currencies.get(i);
      double exchangeRate = exchangeRates.get(currencyCode);
      System.out.println((i + 1) + ". " + currencyCode + " - Курс обмена: " + exchangeRate);
    }
  }

  public double convertCurrency(String sourceCurrency, String targetCurrency, double amount) {
    if (exchangeRates.containsKey(sourceCurrency) && exchangeRates.containsKey(targetCurrency)) {
      double sourceRate = exchangeRates.get(sourceCurrency);
      double targetRate = exchangeRates.get(targetCurrency);
      return amount * (targetRate / sourceRate);
    } else {
      System.out.println("Некорректные валюты.");
    }
    return 0;
  }
}

