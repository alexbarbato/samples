package io.buildpacks.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		Provider[] providers=Security.getProviders();
		for (int i=0; i < providers.length;i++){
			System.out.println("Security Provider: " + i);
			System.out.println(providers[i].getName());
			System.out.println("----------------------------------");
		}

		SpringApplication.run(SampleApplication.class, args);
	}

}
