package com.udemy.dileepsundar.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.udemy.dileepsundar.entity.MovieInfo;

@Repository
public interface MovieInfoRepository extends ReactiveMongoRepository<MovieInfo, String>{

}
