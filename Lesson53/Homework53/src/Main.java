import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  // Создайте класс Book (книга), в конструктор которого передавайте автора,
  // название книги и количество страниц.
  // Реализуйте интерфейс для сравнения книг: они должны сортироваться по
  // авторам, а если авторы совпадают - по названиям (и там, и там - по алфавиту,
  // "в словарном порядке"), а если и авторы совпадают - по количеству страниц (по возрастанию).

  public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("В.Пелевин", "Generation П", 321));
        books.add(new Book("В.Пелевин", "Empire V", 456));
        books.add(new Book("Братья Стругацкие", "Понедельник начинается в субботу", 531));

    Collections.sort(books);
    for (Book book : books) {
      System.out.println(book);
    }
  }
}

