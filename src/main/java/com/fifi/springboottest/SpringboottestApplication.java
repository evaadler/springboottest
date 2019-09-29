package com.fifi.springboottest;

import com.fifi.springboottest.bean.Person;
import com.fifi.springboottest.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringboottestApplication {

	public static void main(String[] args) {
		Person p;
		SpringApplication.run(SpringboottestApplication.class, args);
	}

	//@Bean
	public HelloService helloService(){
		System.out.println("配置类@Bean给容器中添加组件了。。。");
		return new HelloService();
	}

}
