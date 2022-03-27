package com.example.casper_board;

import com.example.casper_board.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})

public class CasperBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasperBoardApplication.class, args);
	}

}
