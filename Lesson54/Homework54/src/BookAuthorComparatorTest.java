import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

// Напишите автотесты с использованием JUnit для задачи 1 из предыдущего домашнего задания.
// Проверьте краевые случаи, предусмотрите разные варианты.

public class BookAuthorComparatorTest {

  @Test
  public void testComparator() {
    Book book1 = new Book("Author1", "Title1", 100);
    Book book2 = new Book("Author2", "Title2", 200);
    Book book3 = new Book("Author1", "Title3", 150);
    Book book4 = new Book("Author3", "Title4", 250);

    List<Book> books = Arrays.asList(book1, book2, book3, book4);
    books.sort(new BookAuthorComparator());

    assertEquals(book1, books.get(0));
    assertEquals(book3, books.get(1));
    assertEquals(book2, books.get(2));
    assertEquals(book4, books.get(3));
  }
}
