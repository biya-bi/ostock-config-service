package com.optimagrowth.config;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import com.optimagrowth.config.io.EnvReader;

@SpringBootApplication
@EnableConfigServer
public class ConfigurationServiceApplication {

	public static void main(String[] args) throws IOException {
		EnvReader.read();

		SpringApplication.run(ConfigurationServiceApplication.class, args);
	}

}
