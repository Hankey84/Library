class Book<Title, Author, Genre, Year> {
    private Title title;
    private Author author;
    private Genre genre;
    private Year year;

    public Book(Title title, Author author, Genre genre, Year year) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    public Title getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public Year getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "    Название: " + title +
                ", Автор: " + author +
                ", Жанр: " + genre +
                ", Год: " + year;
    }
}