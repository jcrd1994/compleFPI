package com.rest.movies.model;


public class Movies {

	private String titulo;
	private String anio;
	private String clasificacion;
	private String sinopsis;
	private String calificacion;
	private String comentario;
	
	
	
	public Movies() {
		
	}
	
	
	public Movies(String titulo, String anio, String clasificacion, String sinopsis, String calificacion,
			String comentario) {
		super();
		this.titulo = titulo;
		this.anio = anio;
		this.clasificacion = clasificacion;
		this.sinopsis = sinopsis;
		this.calificacion = calificacion;
		this.comentario = comentario;
	}


	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	@Override
	public String toString() {
		return String
				.format("Movies [titulo=%s, anio=%s, clasificacion=%s, sinopsis=%s, calificacion=%s, comentario=%s]",
						titulo, anio, clasificacion, sinopsis, calificacion, comentario);
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movies other = (Movies) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
}
