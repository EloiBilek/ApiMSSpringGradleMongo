package com.apimsspringgradlemongo.model.service;

import java.util.List;

import org.springframework.data.domain.Page;

/**
 * @author eloi eloibilek@gmail.com
 */
public interface IOperations<T> {

	T findById(final String id);

	List<T> findAll();

	Page<T> findPaginated(int page, int size);

	T create(final T entity);

	T update(final T entity);

	void delete(final T entity);

	void deleteById(final String entityId);

}
