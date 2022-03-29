package com.lisz;

import com.lisz.api.UserApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserApi.class, args);
	}
}
