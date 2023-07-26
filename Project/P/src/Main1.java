import java.util.Scanner;

public class Main1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    User user = new User();
    // Admin admin = new Admin();
    printMenu();

    int choice = scanner.nextInt();
    scanner.nextLine();
    if (choice == 1) {
      user.runCurrencyConverter();
      // } else if (choice == 2) {
      // admin.runCurrencyConverter();
    } else {
      System.out.println("Некорректный выбор. Завершение программы.");
    }
  }

  public static void printMenu() {
    System.out.println("Меню:");
    System.out.println("1. Пользователь");
    System.out.println("2. Администратор");
    System.out.println("Выберите режим работы: ");
  }
}
