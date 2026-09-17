package practice_16.z3;

public class BookProxy {

    private Book book;
    private boolean isLoaded = false;

    public BookProxy(Book book) {
        this.book = book;
    }

    public String getContent() {
        if (!isLoaded) {
            book.loadContent();
            isLoaded = true;
        }
        return book.getContent();
    }
}
