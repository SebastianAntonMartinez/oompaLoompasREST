package com.napptilus.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.napptilus.rest.models.OompaLoompa;
import com.napptilus.rest.services.OompaLoompaService;

@RestController
@RequestMapping("/oompaloompa")
public class OompaLoompasController {

	@Autowired
	private OompaLoompaService oompaLoompaService;

	@GetMapping()
	public List<OompaLoompa> get() {
		return oompaLoompaService.findAll();
	}

	@GetMapping(value = "/{id}")
	public OompaLoompa getById(@PathVariable("id") int id) {
		return oompaLoompaService.findById(id);
	}

	@PostMapping()
	public OompaLoompa create(@RequestBody() OompaLoompa oompa) {
		return this.oompaLoompaService.save(oompa);
	}

	@PutMapping()
	public OompaLoompa modify(@RequestBody OompaLoompa oompa) {
		return this.oompaLoompaService.modify(oompa);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable("id") int id) {
		oompaLoompaService.deleteById(id);

	}

}
