package com.rest.movies.service;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.movies.model.Movies;





@Service
public class MoviesService {

	private static List<Movies> movies = new ArrayList<>();
	static {
		Movies movie1 = new Movies("Goal", "2005", "PG-13",
		"Santiago Muñez es un experto jugador de fútbol. Su mayor sueño es jugar al fútbol profesional.", "7", "muy buena");
		Movies movie2 = new Movies("Goal2", "2007", "PG-13",
		"Santiago logra jugar para el Real Madrid", "7", "muy buena");
		Movies movie3 = new Movies("Tarzan y Jane",	"2002", "G",
		"Tarzán y Jane celebran su primer año juntos después de casarse, Jane le busca el regalo perfecto de aniversario a Tarzán con la ayuda de Terk y Tantor.",
		"8", "me gusto");
		
		List<Movies> moviess = new ArrayList<>(Arrays.asList(movie1,
				movie2, movie3));
		
		movies.addAll(moviess);
	}

	public List<Movies> retrieveAllMovies() {
		return movies;
	}

	public Movies retrieveMovie(String titulo) {
		for (Movies movie : movies) {
			if (movie.getTitulo().equals(titulo)) {
				return movie;
			}
		}
		return null;
	}
	
	public List<Movies> retrieveAllMoviesbyAnio() {
		return movies;
	}

	public Movies retrieveMoviebyAnio(String anio) {
		for (Movies movie : movies) {
			if (movie.getAnio().equals(anio)) {
				return movie;
			}
		}
		return null;
	}
	private SecureRandom random = new SecureRandom();

	public Movies addMovie(String titulo) {
		Movies movies = retrieveMovie(titulo);
		System.out.println(titulo);
		if (movies == null) {
			return null;
		}

		String ramtitulo = new BigInteger(130, random).toString(32);
		movies.setTitulo(ramtitulo);

		//survey.getQuestions().add(question);

		return movies;
	}
}
