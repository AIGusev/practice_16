package practice_16.z3;

public class Book {

    private String title;
    private String author;
    private String description;
    private String content;

    public Book(BookBuilder builder) {
        this.title = builder.getTitle();
        this.author = builder.getAuthor();
        this.description = builder.getDescription();
        this.content = content;
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
    this.content = title;
    }
}
