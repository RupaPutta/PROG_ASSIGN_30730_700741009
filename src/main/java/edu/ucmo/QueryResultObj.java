package edu.ucmo;

import org.springframework.data.neo4j.annotation.QueryResult;

import java.util.List;

/**
 * @author Sri Sowmya Rupa Putta
 */
@QueryResult
public class QueryResultObj {
    private Integer film_id;
    private String title;
    private List<String> actors;

    public Integer getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }
}
