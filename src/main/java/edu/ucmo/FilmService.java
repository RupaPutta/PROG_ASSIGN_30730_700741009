package edu.ucmo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;

    public List<Film> getAllFilms(){
        return filmRepository.getAllFilms();
    }

    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }

    public void deleteFilmById(Long film_id) {
        filmRepository.deleteById(film_id);
    }
}
