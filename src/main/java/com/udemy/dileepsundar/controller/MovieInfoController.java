package com.udemy.dileepsundar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.dileepsundar.entity.MovieInfo;
import com.udemy.dileepsundar.service.MovieService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1")
public class MovieInfoController {
	
	@Autowired
	MovieService movieServcie;

	@PostMapping("/savemovieinfo")
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<MovieInfo> saveMovieInfo(MovieInfo movieInfo) {
		return movieServcie.saveMovieInfo(movieInfo);
	}
	
}
