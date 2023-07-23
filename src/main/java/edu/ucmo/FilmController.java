package edu.ucmo;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sri Sowmya Rupa Putta
 */
@RestController
@RequestMapping("/api/films")
public class FilmController {
    @Autowired
    private FilmService filmService;

    // Retrieve all the films and shows in database.
    @GetMapping
    public Collection getAllFilms() {
        return filmService.getAllFilms();
    }

    // Insert the new film and show.
    @PostMapping("/film")
    public Film addFilm(@RequestBody Film film) {
        return filmService.saveFilm(film);
    }

    // Update the film and show information using title. (By update only title, description, and rating)
    @PatchMapping("/film")
    public Film updateFilm(@RequestBody Film film) {
        return filmService.updateFilm(film);
    }

    // Delete the film and show information using title.
    @DeleteMapping("/film/{title}")
    public String deleteFilmByTitle(@PathVariable String title) {
        filmService.deleteFilmByTitle(title);
        return "Film deleted successfully with title as " + title;
    }

    // Display the film and show’s detail includes actor’s names.
    @GetMapping("/film")
    public List<QueryResultObj> getFilmAndShowDetailsWithActorNames() {
        return filmService.getFilmAndShowDetailsWithActorNames();
    }
}
