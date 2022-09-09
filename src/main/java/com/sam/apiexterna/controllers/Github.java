package com.sam.apiexterna.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.apiexterna.response.GithubResponse;
import com.sam.apiexterna.service.GitHubService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/github")
@AllArgsConstructor
public class Github {
	
	private final GitHubService service;
	@GetMapping("/{user}")
	public List<GithubResponse> getGitHub(@PathVariable String user) {
		return service.getGitHub(user);
	}

}
