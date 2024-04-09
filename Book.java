class Book<T> {
    private T title; // Название книги

    public Book(T title) {
        this.title = title;
    }

    public T getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "    Книга{" +
                "название:" + title +
                '}';
    }
}