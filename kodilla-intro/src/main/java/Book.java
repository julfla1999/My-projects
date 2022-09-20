public class Book {
    private String author;
    private String title;

    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book.show());
    }
    public static Book of(String author, String title) {
        Book book = new Book();
        book.setParameters(author, title);
        return book;
    }

    private void setParameters(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String show() {
        return this.author + " " + this.title;
    }
}
