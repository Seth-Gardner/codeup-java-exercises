package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String movie, String category) {
        this.name = movie;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
