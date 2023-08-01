import java.util.Objects;

public class Book implements Comparable<Book> {

    private final String author;
    private final String name;
    private final int numberOfPages;

    public Book(String author, String name, int numberOfPages) {
        this.author = author;
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public int compareTo(Book otherBook) {
        if (!author.equals(otherBook.author)) {
            return author.compareTo(otherBook.author);
        }
        if (!name.equals(otherBook.name)) {
            return name.compareTo(otherBook.name);
        }
        return Integer.compare(numberOfPages, otherBook.numberOfPages);
    }

    @Override
    public boolean equals(Object otherBook) {
        if (this == otherBook) {
            return true;
        }
        if (!(otherBook instanceof Book other)) {
            return false;
        }
        return numberOfPages == other.numberOfPages &&
                name.equals(other.name) &&
                author.equals(other.author);
    }

    public int hashCode() {
        return Objects.hash(author, name, numberOfPages);
    }

    public String toString() {
        return author + ", \"" + name + "\", " + numberOfPages + " страниц";
    }

    public String getAuthor() {
        return author;
    }


    public String getName() {
        return name;
    }


    public int getNumberOfPages() {
        return numberOfPages;
    }
}
