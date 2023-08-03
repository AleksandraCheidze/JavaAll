import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book> {

  public int compare(Book o1, Book o2) {
    int compareTitle = o1.getTitle().compareTo(o2.getTitle());
    if (compareTitle != 0) {
      return compareTitle;
    }
    return o1.getAuthor().compareTo(o2.getAuthor());
  }


}
