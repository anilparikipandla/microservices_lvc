package com.example.demo;

public class Rating {

	public Rating() {
		// TODO Auto-generated constructor stub
	}
	
	private String movieId;
	private int rating;
	
	public Rating(String movieId, int rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Rating [movieId=" + movieId + ", rating=" + rating + "]";
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
