public class Poster {
    private MoviePoster[] films = new MoviePoster[0];
    private int quantity;

    public Poster() {
        this.quantity = 5;
    }

    public Poster(int quantity) {
        this.quantity = quantity;
    }


    public void addNewFilms(MoviePoster film) {
        MoviePoster[] tmp = new MoviePoster[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public MoviePoster[] findAll() {
        return films;
    }

    public MoviePoster[] findLast() {
        int resultLength;
        if (films.length < quantity) {
            resultLength = films.length;
        } else {
            resultLength = quantity;
        }
        MoviePoster[] reversed = new MoviePoster[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }


}
