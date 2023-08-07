import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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

  @Test
  public void testEquals() {
    Book book1 = new Book("Author", "Title", 200);
    Book book2 = new Book("Author", "Title", 200);
    Book book3 = new Book("Author2", "Title2", 300);

    assertEquals(book1, book2);
    assertNotEquals(book1, book3);
  }

  @Test
  public void testHashCode() {
    Book book1 = new Book("Author", "Title", 200);
    Book book2 = new Book("Author", "Title", 200);

    assertEquals(book1.hashCode(), book2.hashCode());
  }

  @Test
  public void testToString() {
    Book book = new Book("Author", "Title", 200);
    String expected = "Author, \"Title\", 200 страниц";
  }
}

