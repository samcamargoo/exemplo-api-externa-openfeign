package com.sam.apiexterna.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GithubResponse {
	
	private String id;
	private String node_id;
	private String full_name;
}