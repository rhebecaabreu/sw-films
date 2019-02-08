package com.example.swfilms.model.entities;

import java.util.List;

public class Films {

    private int episodeID;
    private String title;
    private String openingCrawl;
    private String director;
    private String producer;
    private String releaseDate;
    private String posterURL;

    private List<People> charactersList;
    private List<Planets> planetsList;
    private List<Starships> starshipsList;
    private List<Species> speciesList;
    private List<Vehicles> vehiclesList;

    public Films(int episodeID, String title, String openingCrawl, String director, String producer, String releaseDate, String posterURL) {
        this.episodeID = episodeID;
        this.title = title;
        this.openingCrawl = openingCrawl;
        this.director = director;
        this.producer = producer;
        this.releaseDate = releaseDate;
        this.posterURL = posterURL;
    }

    public List<People> getCharactersList() {
        return charactersList;
    }

    public List<Planets> getPlanetsList() {
        return planetsList;
    }

    public List<Starships> getStarshipsList() {
        return starshipsList;
    }

    public List<Species> getSpeciesList() {
        return speciesList;
    }

    public List<Vehicles> getVehiclesList() {
        return vehiclesList;
    }

    public String getPosterURL() {
        return posterURL;
    }


    public int getEpisodeID() {
        return episodeID;
    }

    public String getTitle() {
        return title;
    }

    public String getOpeningCrawl() {
        return openingCrawl;
    }

    public String getDirector() {
        return director;
    }

    public String getProducer() {
        return producer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

}
