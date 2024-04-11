class Book<Title, Author, Genre, Year> {
    private static int number;
    private int id;    
    private Title title;
    private Author author;
    private Genre genre;
    private Year year;

    static {
        number = 0;
    }

    public Book(Title title, Author author, Genre genre, Year year) {
        this.id =  ++number;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    public int getId(){
        return id;
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
        return toStringByTitle();
    }
    public String toStringById(){
        return "Инв.№ "+ id + ", '" + title + "', " + author + ", '" + genre + "', " + year + "г.";
    }

    public String toStringByTitle(){
        return "'" + title + ", " + author + ", '" + genre + "', " + year + "г., Инв.№ "+ id;
    }

    public String toStringByAuthor(){
        return author + ", '" +  title + "', '" + genre + "', " + year + "г., Инв.№ "+ id;
    }

    public String toStringByYear(){
        return year + "г., '" +  title + "', " + author + ", '" + genre + "', Инв.№ "+ id;
    }
    // по остальным полям не стал делать, и так понятен смысл)
}