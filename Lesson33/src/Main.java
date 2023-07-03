public class Main {

  public static void main(String[] args) {

//    Добавить в example01 новый тип документа (бессрочный):
//    - Заявление на увольнение
//    Поля: кому адресовано, кто увольняется, описание
//    реализовать валидацию
//    В Main добавить класс в массив документов
//    На проверку:
//    класс Заявление (Statement) и Main

           Document d1 = new Document("Документ");
           Document d2 = new Document("Документ 2", "2022-02-02");

           Attorney a1 = new Attorney("Доверенность на машину", "Марсель", "Kenen", "2023-12-31");
           Attorney a2 = new Attorney ("Доверенность на холодильник", "Валерий", "Кирилл", "2023-01-10", "2023-02-01");
           DriverLicense dl1 = new DriverLicense("Кирилл", "A, B");
           DriverLicense dl2 = new DriverLicense("Кенан", "B,B1");

    System.out.println(a1.isExpired());
    System.out.println(a2.isExpired());
}
  }