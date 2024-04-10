import java.util.Comparator;

public class BookComparator<Title, Author, Genre, Year> {

    public Comparator<Book<String, String, String, Integer>> sortByTitle() {
        return Comparator.comparing(book -> book.getTitle().toString());
    }

    public Comparator<Book<String, String, String, Integer>> sortByAuthor() {
        return Comparator.comparing(book -> book.getAuthor().toString());
    }

    public Comparator<Book<String, String, String, Integer>> sortByGenre() {
        return Comparator.comparing(book -> book.getGenre().toString());
    }

    public Comparator<Book<String, String, String, Integer>> sortByYear() {
        return Comparator.comparing(book -> book.getYear().toString());
    }
}