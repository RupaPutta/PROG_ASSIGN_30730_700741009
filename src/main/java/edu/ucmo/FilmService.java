package edu.ucmo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sri Sowmya Rupa Putta
 */
@Service
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;

    public List<Film> getAllFilms() {
        return filmRepository.getAllFilms();
    }

    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }

    public Film updateFilm(Film film) {
        return filmRepository.updateFilmByTitleOrDescOrRating(film.getTitle(),
                film.getDescription(), film.getRating());
    }

    public void deleteFilmByTitle(String title) {
        filmRepository.deleteFilmByTitle(title);
    }

    public List<QueryResultObj> getFilmAndShowDetailsWithActorNames() {
        return filmRepository.getFilmAndShowDetailsWithActorNames();
    }
}
