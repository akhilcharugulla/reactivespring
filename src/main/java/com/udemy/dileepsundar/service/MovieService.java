package com.udemy.dileepsundar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.dileepsundar.entity.MovieInfo;
import com.udemy.dileepsundar.repository.MovieInfoRepository;

import reactor.core.publisher.Mono;

@Service
public class MovieService {

	@Autowired
	MovieInfoRepository movieInfoRepository;
	
	public Mono<MovieInfo> saveMovieInfo(MovieInfo movieInfo) {
		return movieInfoRepository.save(movieInfo);
	}

}
