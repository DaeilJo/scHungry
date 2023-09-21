package com.sc.hungry;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
//@EnableWebMvc
@MapperScan(value = {"com.sc.*"})
public class ScHungryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScHungryApplication.class, args);
	}

}
