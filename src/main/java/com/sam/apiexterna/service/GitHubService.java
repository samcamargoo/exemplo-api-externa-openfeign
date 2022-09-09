package com.sam.apiexterna.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sam.apiexterna.response.GithubResponse;

@FeignClient (name = "Github", url = "https://api.github.com/users/")
public interface GitHubService {

	@GetMapping("{user}/repos")
	public List<GithubResponse> getGitHub(@PathVariable String user);
	
}
