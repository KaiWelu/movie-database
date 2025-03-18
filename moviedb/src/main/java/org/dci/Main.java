package org.dci;

import org.dci.Data.DbConnection;
import org.dci.Models.Movie;

import java.sql.SQLException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws SQLException {
        DbConnection dbConnection = new DbConnection();
        ArrayList<Movie> movies = dbConnection.getAllMovies();

        for(Movie movie : movies) {
            System.out.println(movie.getTitle() + "\n");
        }
    }
}