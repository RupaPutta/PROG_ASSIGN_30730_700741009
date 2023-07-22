package edu.ucmo;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends Neo4jRepository<Film, Long> {
    @Query("MATCH (f:Film) RETURN f")
    List<Film> getAllFilms();

}
