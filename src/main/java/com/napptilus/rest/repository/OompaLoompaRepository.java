package com.napptilus.rest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.napptilus.rest.models.OompaLoompa;

public interface OompaLoompaRepository extends CrudRepository<OompaLoompa, Integer> {
	
	public List<OompaLoompa> findAll();

	public OompaLoompa findById(int id);

	public OompaLoompa save(OompaLoompa oompa);

	public void deleteById(int id);
}
