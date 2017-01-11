package br.com.easy.cep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EasyCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyCepApplication.class, args);
	}
}
