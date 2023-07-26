class Admin extends User {

//  public Admin(CurrencyConverter currencyConverter, Scanner scanner) {
//    super(currencyConverter, scanner);
//  }
//
//  @Override
//  public void runCurrencyConverter() {
//    System.out.println("Добро пожаловать в конвертер валют для администратора!");
//    boolean isRunning = true;
//    while (isRunning) {
//      System.out.println("\nМеню администратора:");
//      System.out.println("1. Посмотреть список валют");
//      System.out.println("2. Добавить валюту");
//      System.out.println("3. Изменить курс покупки");
//      System.out.println("0. Выход");
//
//      System.out.print("Выберите действие: ");
//      int choice = scanner.nextInt();
//      scanner.nextLine();
//
//      switch (choice) {
//        case 1:
//          printCurrencyList();
//          break;
//        case 2:
//          System.out.print("Введите код новой валюты: ");
//          String currencyCode = scanner.nextLine().toUpperCase();
//          System.out.print("Введите курс обмена: ");
//          double exchangeRate = scanner.nextDouble();
//          scanner.nextLine();
//
//          addCurrency(currencyCode, exchangeRate);
//          System.out.println("Новая валюта добавлена.");
//          break;
//        case 3:
//          System.out.print("Введите код валюты для изменения курса покупки: ");
//          String currencyCodeToEdit = scanner.nextLine().toUpperCase();
//          System.out.print("Введите новый курс покупки: ");
//          double newBuyRate = scanner.nextDouble();
//          scanner.nextLine();
//
//          editBuyRate(currencyCodeToEdit, newBuyRate);
//          System.out.println("Курс покупки изменен.");
//          break;
//        case 0:
//          isRunning = false;
//          break;
//        default:
//          System.out.println("Некорректный выбор. Повторите попытку.");
//          break;
//      }
//    }
//    System.out.println("Программа завершена. До свидания!");
//  }
//
//  public void editBuyRate(String currencyCode, double newBuyRate) {
//    if (exchangeRates.containsKey(currencyCode)) {
//      exchangeRates.put(currencyCode, newBuyRate);
//    } else {
//      System.out.println("Валюта не найдена.");
//    }
//  }
//}
//
//
}