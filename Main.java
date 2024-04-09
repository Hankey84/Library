public class Main {
    public static void main(String[] args) {
        // Создаем библиотеку с книгами типа String для названия
        Library<String> library = new Library<>();

        // Добавляем книги в библиотеку
        library.addBook(new Book<>("Война и мир"));
        library.addBook(new Book<>("Мураками"));
        library.addBook(new Book<>("Стоик"));

        // Выводим информацию о книгах в библиотеке
        library.displayBooks();

        // Выдаем книгу из библиотеки
        Book<String> borrowedBook = library.borrowBook(1);
        System.out.println("Книги, которые читают: " + borrowedBook);

        // Выводим обновленную информацию о книгах в библиотеке
        library.displayBooks();
    }
}
