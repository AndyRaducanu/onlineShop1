package org.andy.repository.base;


import java.util.List;
import java.util.Optional;

public interface BaseRepository<T> {
    Optional<T> findById(int id);

    void create(T entity);

    void update(T entity);

    void delete(T entity);

    List<T> findAll();

}
