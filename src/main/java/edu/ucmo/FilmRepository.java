package edu.ucmo;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends Neo4jRepository<Film, Long> {
    @Query("MATCH (f:Film) RETURN f")
    List<Film> getAllFilms();
    @Query("MATCH (m:Film { title: $title }) SET m.title = $title, m.description = $description, m.rating = $rating RETURN m.film_id AS film_id, m.title AS title, m.description AS description, m.rental_duration AS rental_duration, m.rental_rate AS rental_rate, m.length AS length, m.replacement_cost AS replacement_cost, m.rating AS rating;")
    Film updateFilmByTitleOrDescOrRating(String title, String description, String rating);
    @Query("MATCH (m:Film { title: $title }) DETACH DELETE m")
    void deleteFilmByTitle(String title);
}
