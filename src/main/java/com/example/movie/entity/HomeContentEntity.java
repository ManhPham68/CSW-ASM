package com.example.movie.entity;

import java.util.List;

public class HomeContentEntity {
    public List<MovieEntity> listTrending;
    public List<MovieEntity> listHot;
    public HomeContentEntity(List<MovieEntity> listTrending) {
        this.listTrending = listTrending;
    }
    public HomeContentEntity() {
    }
}
