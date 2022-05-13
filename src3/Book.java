public class Book {
    private String bookTitle;
    private int pageCount;
    private int yearPublished;

    public Book (String title, int pages, int year) {
        this.bookTitle = title;
        this.pageCount = pages;
        this.yearPublished = year;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return getBookTitle() + ", " + getPageCount() + " pages, " + getYearPublished();
    }
}