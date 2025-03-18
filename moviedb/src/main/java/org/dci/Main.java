package org.dci;

import io.javalin.Javalin;
import org.dci.Data.DbConnection;
import org.dci.Models.Movie;

import java.sql.SQLException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws SQLException {

        // getting all movies from the database
        DbConnection dbConnection = new DbConnection();
        ArrayList<Movie> movies = dbConnection.getAllMovies();

        for(Movie movie : movies) {
            System.out.println(movie.getTitle() + "\n");
        }

        var app = Javalin.create()
                         .get("/", ctx -> ctx.result("Welcome to MovieDB"))
                         .start(7070);

        app.get("/hello", ctx -> ctx.result("This is the hello route"));


    }
}