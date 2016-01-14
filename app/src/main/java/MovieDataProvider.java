/**
 * Created by srthg on 1/14/2016.
 */
public class MovieDataProvider {
//https://www.youtube.com/watch?v=DzpwvZ4S27g
    private int movie_poster_resource;
    private String movie_title;
    private String movie_genre;

    public MovieDataProvider(int movie_poster_resource, String movie_title, String movie_genre) {
        this.movie_poster_resource = movie_poster_resource;
        this.movie_title = movie_title;
        this.movie_genre = movie_genre;
    }

    public int getMovie_poster_resource() {
        return movie_poster_resource;
    }

    public void setMovie_poster_resource(int movie_poster_resource) {
        this.movie_poster_resource = movie_poster_resource;
    }

    public String getMovie_genre() {
        return movie_genre;
    }

    public void setMovie_genre(String movie_genre) {
        this.movie_genre = movie_genre;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }
}
