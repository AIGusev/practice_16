package practice_16.z3;

public class Book {

    private final String title;
    private final String author;
    private final String description;
    private String content;

    Book(BookBuilder builder) {
        this.title = builder.getTitle();
        this.author = builder.getAuthor();
        this.description = builder.getDescription();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getContent() {
        return content;
    }

    public void loadContent() {
        System.out.println("Загрузка контента");
        this.content = "Содержание книги \"" + title + "\"";
    }
}
