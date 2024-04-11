import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

class Library {
    private String filter;
    private List<Book<String, String, String, Integer>> books;
    private List<Book<String, String, String, Integer>> issuedBooks = new ArrayList<>();

    public Library() {
        this.books = new ArrayList<>();
        this.filter = "по инв.№";
    }

    public String getFilter(){
        return filter;
    }

    public void setFilter(String value){
        this.filter = value;
    }

    public void addBook(Book<String, String, String, Integer> book) {
        books.add(book);
    }

    private void addIssuedBook(Book<String, String, String, Integer> book) {
        issuedBooks.add(book);
    }

    // Метод для выдачи книги из библиотеки по названию
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

    public void displayAllBooks() {
        System.out.printf("Информация о всех книгах в библиотеке(%s):\n", getFilter());
        int count = 0;
        for (Book<String, String, String, Integer> book : books) {
            switch (getFilter()) {
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
    
    // Универсальный метод для поиска книги по заданному предикату
    public void findBooks(Predicate<Book<String, String, String, Integer>> predicate, String filter) {
        List<Book<String, String, String, Integer>> result = new ArrayList<>();
        for (Book<String, String, String, Integer> book : books) {
            if (predicate.test(book)) {
                result.add(book);
            }
        }
        System.out.printf("Были найдены по запросу {%s} книги: %s\n", filter, result);

    }    
    
    // Метод сортировки книг по переданному компаратору
    public void sortBooksByParameter(Comparator<Book<String, String, String, Integer>> comparator, String filter) {
        setFilter(filter);
        Collections.sort(books, comparator);
    }
}
