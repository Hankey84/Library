/*Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке. Каждая книга должна содержать 
параметр типа T для ее названия.
Создайте класс Library, который будет представлять библиотеку. У этого класса должны быть методы для 
добавления и выдачи книг.
Добавьте метод для вывода информации о всех выданных книгах.*/
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        String sortedBy = "по инв.№";

        // Добавление книг в библиотеку
        Book<String, String, String, Integer> book1 = new Book<>("1984", "Д. Оруэлл", "Фантастика", 1949);
        Book<String, String, String, Integer> book2 = new Book<>("Стоик", "Т. Драйзер", "Современники", 1947);
        Book<String, String, String, Integer> book3 = new Book<>("Война и мир", "Л.Н. Толстой", "Классика", 1865);
        Book<String, String, String, Integer> book4 = new Book<>("Путешествие в Элевсин", "В.О. Пелевин","Современники", 2023);
        Book<String, String, String, Integer> book5 = new Book<>("Евгений Онегин", "А.С. Пушкин", "Классика", 1831);
        Book<String, String, String, Integer> book6 = new Book<>("Дисгардиум", "Д.С. Сугралинов", "Фантастика", 2018);
        Book<String, String, String, Integer> book7 = new Book<>("Руслан и Людмила", "А.С. Пушкин", "Классика", 1820);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);

        // Вывод информации о всех книгах в библиотеке (первоначально)
        library.displayAllBooks(sortedBy);

        // Сортировка книг по годам
        library.sortBooksByParameter(new BookComparator<>().sortByYear());
        sortedBy = "по годам";

        library.displayAllBooks(sortedBy);
        // Поиск книг по автору
        library.findBooksByAuthor("А.С. Пушкин");
        
        // Выдаем книгу из библиотеки
        library.borrowBook("Война и мир");
        library.borrowBook("1984");
        
        
        // Сортировка книг по авторам и вывод инф-ии о наличии книг в библиотеке
        library.sortBooksByParameter(new BookComparator<>().sortByAuthor());
        sortedBy = "по авторам";
        library.displayAllBooks(sortedBy);
        library.displayIssuedBooks();

    }
}
