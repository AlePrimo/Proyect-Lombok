package com.example;

import com.example.persistence.entities.Player;
import com.example.persistence.repository.PLayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class LombokAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokAppApplication.class, args);
	}


    @Autowired
	private PLayerRepository pLayerRepository;


	@Bean
	CommandLineRunner init(){
		return args -> {
			List<Player> players = (List<Player>) this.pLayerRepository.findAll();
			System.out.println(players);

		};
	}






}
