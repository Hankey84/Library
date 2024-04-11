import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Library {
    private List<Book<String, String, String, Integer>> books;
    private List<Book<String, String, String, Integer>> issuedBooks = new ArrayList<>();

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book<String, String, String, Integer> book) {
        books.add(book);
    }

    private void addIssuedBook(Book<String, String, String, Integer> book) {
        issuedBooks.add(book);
    }

    // Метод для выдачи книги из библиотеки
    public Book<String, String, String, Integer> borrowBook(String title) {
        for (Book<String, String, String, Integer> book : books) {
            if (book.getTitle().equals(title)) {
                addIssuedBook(book);
                System.out.println("Была выдана книга: " + book);
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks(String value) {
        System.out.printf("Информация о всех книгах в библиотеке(%s):\n", value);
        int count = 0;
        for (Book<String, String, String, Integer> book : books) {
            switch (value) {
                case "по названию":
                    System.out.printf("    %d). %s\n", ++count, book.toStringByTitle());
                    break;
                case "по авторам":
                    System.out.printf("    %d). %s\n", ++count, book.toStringByAuthor());
                    break;
                case "по годам":
                    System.out.printf("    %d). %s\n", ++count, book.toStringByYear());
                    break;
                case "по инв.№":
                    System.out.printf("    %d). %s\n", ++count, book.toStringById());
                    break;
                default:
                    break;
            }
        }
    }

    public void displayIssuedBooks() {
        System.out.printf("Информация о выданных книгах:\n");
        int count = 0;
        for (Book<String, String, String, Integer> book : issuedBooks) {
            System.out.printf("    %d). %s\n", ++count, book);
        }
    }

    public List<Book<String, String, String, Integer>> findBooksByAuthor(String author) {
        List<Book<String, String, String, Integer>> result = new ArrayList<>();
        for (Book<String, String, String, Integer> book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        System.out.printf("Были найдены по запросу {%s} книги: %s\n", author, result);
        return result;
    }

    // Метод сортировки книг по переданному компаратору
    public void sortBooksByParameter(Comparator<Book<String, String, String, Integer>> comparator) {
        Collections.sort(books, comparator);
    }
}
