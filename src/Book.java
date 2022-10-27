public class Book {
    private final String bookName;
    private final Author Author;
    private int publisherYear;

    public Book(String bookName, Author Author, int publisherYear) {
        this.bookName = bookName;
        this.Author = Author;
        this.publisherYear = publisherYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.Author;
    }

    public int getPublisherYear() {
        return this.publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    @Override
    public String toString() {
        return bookName + " " + getAuthor() + " " + publisherYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book1 = (Book) other;
        return bookName.equals(book1.bookName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }
}

