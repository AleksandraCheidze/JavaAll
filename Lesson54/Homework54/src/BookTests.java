import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BookTests {

  @Test
  public void testCompareTo() {
    Book book1 = new Book("Author1", "Title1", 100);
    Book book2 = new Book("Author1", "Title2", 200);
    Book book3 = new Book("Author1", "Title1", 100);
    assertTrue(book1.compareTo(book2) < 0);
    assertTrue(book2.compareTo(book1) > 0);
    assertEquals(0, book1.compareTo(book3));
  }


}
