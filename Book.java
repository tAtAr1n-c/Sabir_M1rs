package DZOOP;

public class Book {
    private String tittle;
    private String author;
    private int year;
    private boolean isAvaliable;
    private int pageCount;
    public Book(String tittle, String author, int year, boolean isAvaliable, int pageCount) {
        this.tittle = tittle;
        this.author = author;
        this.year = year;
        this.isAvaliable = isAvaliable;
        this.pageCount = pageCount;
    }
    public Book(){
        this("Безымянный", "Безымянный", 0, false, 0);
    }
    public Book(String tittle, String author, int year){
        this(tittle, author, year, true, 0);
    }
    public String displayInfo(){
        String x = "Название:"  + tittle +  "\n Автор: " + author + "\nГод издания:" + year + "\nНаличие: " + isAvaliable + "\nКоличество страниц: "  + pageCount;
        return x;
    }
    public void borrowBook(){
        isAvaliable = false;
    }
    public void returnBook(){
        isAvaliable = true;
    }
    public void updateYear(int year){
        this.year = year;
    }
}
