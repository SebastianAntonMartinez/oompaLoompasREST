package com.napptilus.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.napptilus.rest.errorhandling.RequestException;
import com.napptilus.rest.models.OompaLoompa;
import com.napptilus.rest.repository.OompaLoompaRepository;

@Service
public class OompaLoompaService {

	@Autowired
	private OompaLoompaRepository oompaLoompaRepository;

	/**
	 * this function returns the list of Oompa Loompas
	 * 
	 * @return List of Ommpa Loompas
	 */
	public List<OompaLoompa> findAll() {
		return this.oompaLoompaRepository.findAll();
	}

	/**
	 * 
	 * @param oompaLoompa the information of an Ommpa Loompa
	 * @return created Oompa Loompa
	 */
	public OompaLoompa save(OompaLoompa oompaLoompa) {
		
		if (oompaLoompa.getName()==null)
			throw new RequestException("The parameter name is required");
		if (oompaLoompa.getJob()==null)
			throw new RequestException("The parameter job is required");

		return this.oompaLoompaRepository.save(oompaLoompa);
	}

	/**
	 * 
	 * @param oompaLoompa the information of an Ommpa Loompa
	 * @return created Oompa Loompa
	 */
	public OompaLoompa modify(OompaLoompa oompaLoompa) {
		if (oompaLoompa.getId() == null)
			throw new RequestException("The parameter id is required");

		return this.oompaLoompaRepository.save(oompaLoompa);
	}

	/**
	 * this function returns an Oompa Loompa information
	 * 
	 * @param The identifier of an Oompa Loompa
	 * @return Oompa Loompa information
	 */
	public OompaLoompa findById(int id) {
		OompaLoompa oompaLoompa = this.oompaLoompaRepository.findById(id);

		if (oompaLoompa == null) {
			throw new RequestException("the specified identifier does not correspond with any Oompa Loompa");
		} else {
			return oompaLoompa;
		}

	}

	/**
	 * this function deletes an oompa loompa from the list
	 * 
	 * @param The identifier of an Oompa Loompa
	 */
	public void deleteById(int id) {
		this.oompaLoompaRepository.deleteById(id);
	}

}
