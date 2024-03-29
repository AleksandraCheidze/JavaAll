public class Main {
  //  Добавить в example01 новый тип документа (бессрочный):
//    - Заявление на увольнение
//    Поля: кому адресовано, кто увольняется, описание
//    реализовать валидацию
//    В Main добавить класс в массив документов
//    На проверку:
//    класс Заявление (Statement) и Main
  public static void main(String[] args) {

    Attorney a1 = new Attorney("Доверенность на машину",
        "Марсель", "Кенан", "2023-12-31");

    Attorney a2 = new Attorney("Доверенность на холодильник",
        "Валерий", "Кирилл", "2023-01-10", "2023-02-01");

    DriverLicense dl1 = new DriverLicense("Кирилл", "A, B");
    DriverLicense dl2 = new DriverLicense("Кенан", "B,B1");

    Contract c1 =
        new Contract("Контракт на проведение курса у 27",
            "2023-03-15", 0.5);
    Contract c2 =
        new Contract("Контракт на авторские права",
            "2022-05-06", 1000);
    Statement r1 =
        new Statement("Заявление на увольнение",
            "Людмила Прокофьевна Калунина", "Анатолий Ефремович Новосельцев",
            "2022-05-06");

    Document[] documents = {a1, a2, dl1, dl2, c1, c2, r1}; // массив документов
    ExpirationDocument[] expirationDocuments = {a1, a2, dl1, dl2};

    for (int i = 0; i < documents.length; i++) {
      System.out.println(documents[i].isValid());
    }

    for (int i = 0; i < expirationDocuments.length; i++) {
      System.out.println(expirationDocuments[i].isExpired());
    }
    }
  }
