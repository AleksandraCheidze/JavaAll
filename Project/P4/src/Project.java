import java.util.HashMap;
import java.util.Scanner;

public class Project {

  public static void main(String[] args) {
    HashMap<String, Double> exchangeRate = new HashMap<>();
    exchangeRate.put("EUR", 1.00);
    exchangeRate.put("USD", 1.11);
    exchangeRate.put("GBP", 0.87);

    User userConverter = new User();
    userConverter.exchangeRates = exchangeRate;
    userConverter.monitoring(new Scanner(System.in));

    Admin adminConverter = new Admin();
    adminConverter.exchangeRates = exchangeRate;
    adminConverter.monitoring(new Scanner(System.in));
  }

}





