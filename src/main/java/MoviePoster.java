public class MoviePoster {
    private int id;
    private String filmName;
    private String filmGenre;

    public MoviePoster(int id, String filmName, String filmGenre) {
        this.id = id;
        this.filmName = filmName;
        this.filmGenre = filmGenre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }
}
