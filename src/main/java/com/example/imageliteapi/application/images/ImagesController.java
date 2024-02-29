package com.example.imageliteapi.application.images;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController // Spring Boot annotation to define a REST controller
@RequestMapping("/v1/images") // Spring Boot annotation to define a REST controller path
@Slf4j  // lombok annotation to enable logging
public class ImagesController {

	@PostMapping // Spring Boot annotation to define a POST method
	public ResponseEntity save(
			@RequestParam("file") MultipartFile file,
			@RequestParam("name") String name,
			@RequestParam("tags") List<String> tags
	){
		log.info("Imagem recebida: name {}, size {}", file.getOriginalFilename(), file.getSize());
		log.info("Nome definido para a imagem: {}", name);
		log.info("Tags: {}", tags);
		return ResponseEntity.ok().build(); // Spring Boot class to define a HTTP 200 response
	}
}
