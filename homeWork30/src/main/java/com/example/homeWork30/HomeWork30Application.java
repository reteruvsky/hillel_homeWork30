package com.example.homeWork30;

import com.amazonaws.services.s3.AmazonS3;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
@RequiredArgsConstructor
public class HomeWork30Application implements CommandLineRunner {

	private final AmazonS3 amazonS3;

	public static void main(String[] args) {
		SpringApplication.run(HomeWork30Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		amazonS3.listBuckets().forEach(System.out::println);
		//amazonS3.createBucket("home-work-30");
		amazonS3.putObject("home-work-30", "HM30", new File("homeWork30"));
	}
}
