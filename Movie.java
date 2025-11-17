package DZOOP;

public class Movie {
    private String tittle;
    private String director;
    private int year;
    private int duration;
    private double rating;
    private boolean isAvailable;

    public Movie(String tittle, String director, int year, int duration, double rating, boolean isAvailable){
        this.tittle = tittle;
        this.director = director;
        this.year = year;
        this.duration = duration;
        setRating(rating);
        this.isAvailable = isAvailable;
    }

    public Movie(String tittle, String director, int year){
        this(tittle,director,year,0,0.0,false);
    }

    public Movie(){
        this("","",0,0,0.0,false);
    }

    public void updateRating(double rating){
        this.rating = rating;
    }

    public void markAsAvailable(){
        this.isAvailable = true;
    }

    public void markAsNotAvailable(){
        this.isAvailable = false;
    }

    private void setRating(double rating){
        if(rating >= 0 && rating <= 10){
            this.rating = rating;
        }else {
            throw new IllegalArgumentException("Нужно больше 0 и меньше 10");
        }
    }

    public String displayInfo(){
        return "Название: " + tittle + "\nРежисер: " + director + "\nГод: " + year + "\nПродолжительность: " + duration + "\nРейтинг: " +  rating + "\nМожно ли посмотреть: " + isAvailable;
    }

    public String addToPlayList(Movie movie){
        return "Фильм: " + tittle + " dобавлен в плейст";
    }
}
