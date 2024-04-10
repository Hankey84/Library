import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Library {
    private List<Book<String, String, String, Integer>> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book<String, String, String, Integer> book) {
        books.add(book);
    }

    public Book<String, String, String, Integer> getBook(int index) {
        return books.get(index);
    }

    public void displayAllBooks() {
        for (Book<String, String, String, Integer> book : books) {
            System.out.println(book);
        }
    }

    public List<Book<String, String, String, Integer>> findBooksByAuthor(String author) {
        List<Book<String, String, String, Integer>> result = new ArrayList<>();
        for (Book<String, String, String, Integer> book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    // Метод сортировки книг по переданному компаратору
    public void sortBooksByParameter(Comparator<Book<String, String, String, Integer>> comparator) {
        Collections.sort(books, comparator);
    }
    
}
