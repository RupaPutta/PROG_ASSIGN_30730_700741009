package edu.ucmo;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/films")
public class FilmController {
    @Autowired
    private FilmService filmService;

    @GetMapping
    public Collection getAllFilms() {
        return filmService.getAllFilms();
    }

    @PostMapping("/film")
    public Film addFilm(@RequestBody Film film) {
        return filmService.saveFilm(film);
    }

    @PatchMapping("/film")
    public Film updateFilm(@RequestBody Film film) {
        return filmService.saveFilm(film);
    }

    @DeleteMapping("/{film_id}")
    public String deleteFilmById(@PathVariable String film_id) {
        filmService.deleteFilmById(Long.parseLong(film_id));
        return "Film deleted successfully";
    }
}
