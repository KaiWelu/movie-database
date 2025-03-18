package org.dci.Models;

public class Movie {
    private Integer id;
    private String title;
    private String director;
    private Integer duration;
    private Float rating;
    private boolean hasOscars;
    private String description;
    private Integer releaseYear;

    public Movie(Integer id,
                 String title,
                 String director,
                 Integer duration,
                 Float rating,
                 boolean hasOscars,
                 String description,
                 Integer releaseYear) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.rating = rating;
        this.hasOscars = hasOscars;
        this.description = description;
        this.releaseYear = releaseYear;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public boolean isHasOscars() {
        return hasOscars;
    }

    public void setHasOscars(boolean hasOscars) {
        this.hasOscars = hasOscars;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

//    @Override
//    public String toString(){
//        return "Yolo";
//    }
}
