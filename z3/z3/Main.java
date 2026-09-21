package practice_16.z3;

public class Main {
    static void main(String[] args) {

        BookBuilder builder = new BookBuilder();
        Book book = builder.setTitle("Лучшая книга в мире")
                .setAuthor("Народная")
                .setDescription("Рассказывает как заработать много денег")
                .build();

        BookProxy proxy = new BookProxy(book);

        String content = proxy.getContent();
        System.out.println(content);
    }
}
