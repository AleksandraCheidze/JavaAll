public class Book implements Comparable<Book> {

    private String author;
    private String name;
    private int numberOfPages;

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


    public String getAuthor() {
        return author;
    }


    public String getName() {
        return name;
    }


    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
