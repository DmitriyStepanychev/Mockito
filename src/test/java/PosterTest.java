import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class PosterTest {

    MoviePoster film1 = new MoviePoster(1, "Бладшот", "боевик");
    MoviePoster film2 = new MoviePoster(2, "Вперед", "мультфильм");
    MoviePoster film3 = new MoviePoster(3, "Отель Белград", "комедия");
    MoviePoster film4 = new MoviePoster(4, "Джентльмены", "боевик");
    MoviePoster film5 = new MoviePoster(5, "Человек-невидимка", "ужасы");
    MoviePoster film6 = new MoviePoster(6, "Тролли. Мировой тур", "мультфильм");
    MoviePoster film7 = new MoviePoster(7, "Номер один", "комедия");

    @Test
    public void testAddNewFilm() {
        Poster movie = new Poster();
        movie.addNewFilms(film1);
        movie.addNewFilms(film2);
        movie.addNewFilms(film3);
        movie.addNewFilms(film4);
        movie.addNewFilms(film5);
        movie.addNewFilms(film6);
        movie.addNewFilms(film7);

        MoviePoster[] expected = {film1, film2, film3, film4, film5, film6, film7};
        MoviePoster[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showFilmReversedWithoutUserQuantity() {
        Poster movie = new Poster();
        movie.addNewFilms(film1);
        movie.addNewFilms(film2);
        movie.addNewFilms(film3);
        movie.addNewFilms(film4);
        movie.addNewFilms(film5);
        movie.addNewFilms(film6);
        movie.addNewFilms(film7);
        movie.findLast();

        MoviePoster[] expected = {film7, film6, film5, film4, film3};
        MoviePoster[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void showFilmReversedWithUserQuantity7() {
        Poster movie = new Poster(7);
        movie.addNewFilms(film1);
        movie.addNewFilms(film2);
        movie.addNewFilms(film3);
        movie.addNewFilms(film4);
        movie.addNewFilms(film5);
        movie.addNewFilms(film6);
        movie.addNewFilms(film7);
        movie.findLast();

        MoviePoster[] expected = {film7, film6, film5, film4, film3, film2, film1};
        MoviePoster[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showFilmReversedWithUserQuantity3() {
        Poster movie = new Poster(3);
        movie.addNewFilms(film1);
        movie.addNewFilms(film2);
        movie.addNewFilms(film3);
        movie.addNewFilms(film4);
        movie.addNewFilms(film5);
        movie.addNewFilms(film6);
        movie.addNewFilms(film7);
        movie.findLast();

        MoviePoster[] expected = {film7, film6, film5};
        MoviePoster[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showFilmReversedWithUserQuantity8() {
        Poster movie = new Poster(8);
        movie.addNewFilms(film1);
        movie.addNewFilms(film2);
        movie.addNewFilms(film3);
        movie.addNewFilms(film4);
        movie.addNewFilms(film5);
        movie.addNewFilms(film6);
        movie.addNewFilms(film7);
        movie.findLast();

        MoviePoster[] expected = {film7, film6, film5, film4, film3, film2, film1};
        MoviePoster[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
