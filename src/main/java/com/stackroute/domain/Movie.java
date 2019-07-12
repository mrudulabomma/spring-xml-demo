package com.stackroute.domain;

import java.util.List;

public class Movie {


    List<Actor> actor;

    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }

    public List<Actor> getActor() {
        return actor;
    }

    public Movie(List<Actor> actor){
       this.actor=actor;
   }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
