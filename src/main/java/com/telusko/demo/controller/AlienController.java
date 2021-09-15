package com.telusko.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;

@RestController
public class AlienController
{
	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}

	@PostMapping("/alien")
	public Alien addAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}

	@PutMapping("/alien")
	public Alien UpdateAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}

	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable int aid){

		Alien alien = repo.getOne(aid);
		repo.delete(alien);

		return "Deleted Susess";
	}

	@GetMapping("/aliens")
	public List<Alien> getAliens()
	{
		return repo.findAll();


	}
	@RequestMapping("/alien/{aid}")
	public Optional<Alien> getAlien(@PathVariable("aid")int aid)
	{
		return repo.findById(aid);


	}
}
