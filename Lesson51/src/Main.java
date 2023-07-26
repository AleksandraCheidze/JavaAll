import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  // Усовершенствуйте класс Month из классной работы.
  // Добавьте для каждого месяца количество дней.
  // Спросите у пользователя номер месяца (нумерация начинается с 1,
  // январь - первый месяц!) и выведите по номеру название и количество дней.
  public static void main(String[] args) {

//    Month currentMonth = Month.JULY;
//    System.out.println(currentMonth);
//    System.out.println(currentMonth.ordinal() + 1);

    Scanner scanner = new Scanner(System.in);
    int monthNumber;

    while (true) {
      try {
        System.out.print("Введите номер месяца (1-12): ");
        monthNumber = scanner.nextInt();

        if (monthNumber < 1 || monthNumber > 12) {
          System.out.println("Неправильный номер месяца. Попробуйте снова.");
        } else {
          break;
        }
      } catch (InputMismatchException e) {
        scanner.nextLine();
        System.out.println("Неправильный ввод. Пожалуйста, введите целое число.");
      }
    }

    Month chosenMonth = Month.values()[monthNumber - 1];
    System.out.println("Название месяца: " + chosenMonth.getName());
    System.out.println("Количество дней в месяце: " + chosenMonth.getDays());

//    for (Month m : Month.values()) {
//      System.out.println("Месяц " + m + ", порядковый номер " + m.ordinal());
//    }
//
//    Month second = Month.values()[1];
//    System.out.println("second: " + second + ", second.getName(): " + second.getName());
//
//    System.out.println(
//        "Month.valueOf(\"March\".toUpperCase()): " + Month.valueOf("March".toUpperCase()));

  }
}