package edu.rosehulman.moviequotes;

/**
 *
 * The model for a moviequote
 *
 * Created by rockwotj on 4/22/2015.
 */
public class MovieQuote {

    private String key;
    private String movie;
    private String quote;

    public MovieQuote(String key, String movie, String quote) {
        this.key = key;
        this.movie = movie;
        this.quote = quote;
    }

    public String getKey() {
        return key;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
