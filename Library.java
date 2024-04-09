import java.util.ArrayList;
import java.util.List;

class Library<T> {
    private List<Book<T>> books; // Список книг

    public Library() {
        this.books = new ArrayList<>();
    }

    // Метод для добавления книги в библиотеку
    public void addBook(Book<T> book) {
        books.add(book);
    }

    // Метод для выдачи книги из библиотеки
    public Book<T> borrowBook(int index) {
        if (index >= 0 && index < books.size()) {
            return books.remove(index);
        } else {
            return null;
        }
    }

    // Метод для вывода информации о всех книгах в библиотеке
    public void displayBooks() {
        System.out.println("Книги в библиотеке:");
        for (Book<T> book : books) {
            System.out.println(book);
        }
    }
}