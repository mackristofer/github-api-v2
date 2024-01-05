package br.com.m3tech.githubapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.m3tech.githubapi.dto.GithubDataRequestDTO;
import reactor.core.publisher.Mono;

@Service
public class GithubApiRequest {

	@Autowired
	private WebClient webClient;
	
	public GithubDataRequestDTO requestGithubApi(String username) {
		
		Mono<GithubDataRequestDTO> request = webClient
				.get()
				.uri("/{username}", username)
				.retrieve()
				.bodyToMono(GithubDataRequestDTO.class);	 
				return request.block();
	}
}
