package DZOOP;
import java.util.Scanner;
public class Book {
    private static Scanner scanner = new Scanner(System.in);
    private static int totalBooks = 0;
    private final int maxYear = 2025;
    private String tittle;
    private String author;
    private int year;
    private boolean isAvaliable;
    private int pageCount;

    public Book(String tittle, String author, int year, boolean isAvaliable, int pageCount) {
        setTitle(tittle);
        setAuthor(author);
        setYear(year);
        setIsAvaliable(isAvaliable);
        setPageCount(pageCount);
        totalBooks++;
    }

    public Book(){
        this("Безымянный", "Безымянный", 0, false, 0);
        totalBooks++;
    }

    public Book(String tittle, String author, int year){
        this(tittle, author, year, true, 0);
        totalBooks++;
    }

    public void setTitle(String tittle){
        if(tittle == null){
            System.out.println("Введи нормально");
            this.tittle = scanner.nextLine();
        }
        this.tittle = tittle;
    }
    public void setAuthor(String author){
        if(author == null){
            System.out.println("Введи нормально");
            this.author = scanner.nextLine();
        }
        this.author = author;
    }
    public void setYear(int year){
        while(year > 2025){
            System.out.println("Введи нормально");
            this.year = scanner.nextInt();
        }
        this.year = year;
    }
    public void setIsAvaliable(boolean isAvaliable){
        this.isAvaliable = isAvaliable;
    }
    public void setPageCount(int pageCount){
        while(pageCount < 0){
            System.out.println("Число страниц должно быть больше 0...");
            this.pageCount = scanner.nextInt();
        }
        this.pageCount = pageCount;
    }


    public String getTitle(){
        return tittle;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
    public boolean getisAvaliable(){
        return isAvaliable;
    }
    public int getPageCount(){
        return pageCount;
    }
    public static int getTotalBooks() {
        return totalBooks;
    }


    public String displayInfo(boolean detailed){
        if(detailed) {
            String x = "Название:" + tittle + "\n Автор: " + author + "\nГод издания:" + year + "\nНаличие: " + isAvaliable + "\nКоличество страниц: " + pageCount;
            return x;
        }else{
            String x = "Название:" + tittle + "\n Автор: " + author + "\nГод издания:" + year;
            return x;
        }
    }

    public void borrowBook(String borrowName){
        isAvaliable = false;
        System.out.println(borrowName);
    }

    public void returnBook(){
        setIsAvaliable(true);
    }

}
