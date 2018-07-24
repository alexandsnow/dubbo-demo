package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboProducerApplication {

	public static void main(String[] args) {
        new EmbeddedZooKeeper(2181, false).start();
		SpringApplication.run(DubboProducerApplication.class, args);
	}
}
