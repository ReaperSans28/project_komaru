public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Алан", "Мур");
        Author author2 = new Author("Араки", "Хирохико");

        Book book1 = new Book("Хранители", author1, 1986);
        Book book2 = new Book("JOJO A-Go! Go!", author2, 2000);

        System.out.println("Книга: " + book1.getTitle() + ", Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Год: " + book1.getPublicationYear());
        System.out.println("Книга: " + book2.getTitle() + ", Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Год: " + book2.getPublicationYear());

        book1.setPublicationYear(1987);
        System.out.println("После изменения года публикации:");
        System.out.println("Книга: " + book1.getTitle() + ", Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Год: " + book1.getPublicationYear());
    }
}