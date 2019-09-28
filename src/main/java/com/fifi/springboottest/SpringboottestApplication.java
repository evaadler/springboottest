package com.fifi.springboottest;

import com.fifi.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringboottestApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringboottestApplication.class, args);
	}

	@Bean
	public HelloService helloService(){
		System.out.println("配置类@Bean给容器中添加组件了。。。");
		return new HelloService();
	}

}
