// Practice how setters and getters work to encapsulate POJO data.
class Test2 {
    public static void main(String[] args) {
        Movie jaws = new Movie();
        jaws.setTitle("Jaws");
        jaws.setDirector("Spielberg");
        jaws.setRating("PG");
        System.out.println(jaws.getRating());
    }
}

public class Movie {
    private String title;
    private String director;
    private String rating;
    public String getTitle() {
        return title;      
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector(String director) {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

}