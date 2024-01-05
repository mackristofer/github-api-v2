package br.com.m3tech.githubapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.m3tech.githubapi.dto.GithubDataRequestDTO;
import br.com.m3tech.githubapi.services.GithubApiRequest;

@RestController
@RequestMapping(value = "/search")
public class GithubRequestController {

	@Autowired
	private GithubApiRequest service;
	
	@GetMapping(value = "/{username}")
	public ResponseEntity<GithubDataRequestDTO> requestGithubApi(@PathVariable String username) {
		GithubDataRequestDTO dto = service.requestGithubApi(username);
		return ResponseEntity.ok(dto);
	}
}
