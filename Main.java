
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Добавление книг в библиотеку
        Book<String, String, String, Integer> book1 = new Book<>("1984", "Д. Оруэлл", "Фантастика", 1949);
        Book<String, String, String, Integer> book2 = new Book<>("Стоик", "Т. Драйзер", "Современники", 1947);
        Book<String, String, String, Integer> book3 = new Book<>("Война и мир", "Л.Н. Толстой", "Классика", 1865);
        Book<String, String, String, Integer> book4 = new Book<>("Путешествие в Элевсин", "В.О. Пелевин", "Современники", 2023);
        Book<String, String, String, Integer> book5 = new Book<>("Евгений Онегин", "А.С. Пушкин", "Классика", 1831);
        Book<String, String, String, Integer> book6 = new Book<>("Дисгардиум", "Д.С. Сугралинов", "Фантастика", 2018);


        library.addBook(book1); library.addBook(book2); library.addBook(book3);
        library.addBook(book4); library.addBook(book5); library.addBook(book6);


        // Вывод информации о всех книгах в библиотеке
        System.out.println("Информация о всех книгах в библиотеке:");
        library.displayAllBooks();

        // Сортировка книг по годам
        library.sortBooksByParameter(new BookComparator<>().sortByYear());
        System.out.println("Список книг, отсортированных по годам:");
        library.displayAllBooks();
        // // Сортировка книг по авторам(и т.д.)
        // library.sortBooksByParameter(new BookComparator<>().sortByAuthor());
        // System.out.println("Список книг, отсортированных по авторам:");
        // library.displayAllBooks();

        
    }
}
