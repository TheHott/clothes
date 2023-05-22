package com.evgensoft.spring.webshop.clothes.repository;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.util.Assert;

import com.evgensoft.spring.webshop.clothes.model.entity.BaseEntity;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID> {    
    @Override
    default void deleteById(ID id) {
        Assert.notNull(id, "The given id must not be null!");
        this.delete(findById(id).orElseThrow(() -> new EmptyResultDataAccessException(
                String.format("No %s entity with id %s exists!", "", id), 1)));
    }

    @Override
    default void delete(T entity) {
        Assert.notNull(entity, "The entity must not be null!");

        ((BaseEntity) entity).setDeleted(true);
        save(entity);
    }

    @Override
    default void deleteAll() {
        List<T> entities = findAll();

        this.deleteAll(entities);
    }

    @Override
    default void deleteAll(Iterable<? extends T> entities) {
        for(T entity : entities)
            ((BaseEntity) entity).setDeleted(true);

        saveAll(entities);
    }
}
