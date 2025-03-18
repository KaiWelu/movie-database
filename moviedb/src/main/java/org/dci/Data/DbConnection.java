package org.dci.Data;

import org.dci.Models.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbConnection {
    static String jbcdUrl = "jdbc:postgresql://localhost:5432/dci";
    static String username = "postgres";
    static String password = "your_secure_password";
    static Connection connection;

    public ArrayList<Movie> getAllMovies() throws SQLException {
        ArrayList<Movie> movies = new ArrayList<>();

        connection = DriverManager.getConnection(jbcdUrl, username, password);

        // selects every column from the movies table and sends query
        String query = "SELECT * FROM movies";
        Statement statement = connection.createStatement();
        ResultSet queryResult = statement.executeQuery(query);

        // process the results
        while (queryResult.next()) {
            // create Movie object and add to list
            Movie movie = new Movie(queryResult.getInt("movie_id"),
                                    queryResult.getString("title"),
                                    queryResult.getString("director"),
                                    queryResult.getInt("duration"),
                                    queryResult.getFloat("rating"),
                                    queryResult.getBoolean("has_oscars"),
                                    queryResult.getString("description"),
                                    queryResult.getInt("release_year")
                                    );

            movies.add(movie);
        }

        // close connection
        connection.close();
        return movies;
    }
}
