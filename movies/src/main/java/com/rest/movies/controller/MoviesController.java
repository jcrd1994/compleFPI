package com.rest.movies.controller;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rest.movies.model.Movies;
import com.rest.movies.service.MoviesService;


@RestController
public class MoviesController {

	@Autowired
	private MoviesService movieService;
	
	@CrossOrigin 
	@GetMapping("/getAllMovies/movies")
	public List<Movies> retrieveMovies(){
		return movieService.retrieveAllMovies();
	}
	
	@CrossOrigin
	@GetMapping("/getMoviesByYear/movies")
	public List<Movies> retrieveMoviesbyAnio(){
		return movieService.retrieveAllMoviesbyAnio();
	}
	
	@CrossOrigin
	@PostMapping("/getAllMovies/{titulo}/movies")
	public ResponseEntity addNewMovie(@PathVariable String titulo, @RequestBody String title, String anio, String clasificacion, String sinopsis, String calificacion, String comentario){
		Movies movie = movieService.addMovie(titulo);
		//Validacion para pregunta nula
		if(movie == null)
			return ResponseEntity.noContent().build();
		//Creating the return URL
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{titulo}")
		.buildAndExpand(movie.getTitulo()).toUri();
		//Respuesta
		return ResponseEntity.created(location).build();
		
	}
	@CrossOrigin
	@GetMapping("/getAllMovies/{titulo}/movies")
	public Movies retrieveDetailsForMovie(@PathVariable String titulo){
		return movieService.retrieveMovie(titulo);
	}
	@CrossOrigin
	@GetMapping("/getMoviesByYear/{anio}/movies")
	public Movies retrieveMoviesbyyear(@PathVariable String anio){
		return movieService.retrieveMoviebyAnio(anio);
	}
}
