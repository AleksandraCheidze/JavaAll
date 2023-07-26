import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Project {

  public static void main(String[] args) {
    HashMap<String, Double> exchangeRate = new HashMap<>();
    ArrayList<String> currencies = new ArrayList<>();

    exchangeRate.put("USD", 1.00);
    exchangeRate.put("EUR", 0.85);
    exchangeRate.put("GBP", 0.72);

    int amount = getModeSelection();
    if (amount == 1) {
      Admin admin = new Admin();
      admin.runCurrencyConverter(exchangeRate);
    } else if (amount == 2) {
      User user = new User();
      user.runCurrencyConverter(exchangeRate);
    } else {
      System.out.println("Некорректный выбор. Программа завершена.");
    }
  }

  private static int getModeSelection() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Выберите режим:");
    System.out.println("1. Администратор");
    System.out.println("2. Пользователь");
    System.out.print("Ваш выбор: ");
    while (!scanner.hasNextInt()) {
      String error = scanner.nextLine();
      System.out.println("Некорректный ввод: " + error + ". Попробуйте снова.");
      System.out.println("Выберите режим:");
      System.out.println("1. Администратор");
      System.out.println("2. Пользователь");
      System.out.print("Ваш выбор: ");
    }
    int mode = scanner.nextInt();
    scanner.nextLine();
    return mode;
  }
}







