package com.fifi.springboottest;

import com.fifi.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 单元测试用Spring的驱动器来跑
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringboottestApplicationTests {

	@Autowired
	MyProcessor myProcessor;

	@Autowired
	HelloInterface helloInterface;

	@Autowired
	Person person;

	@Test
	public void contextLoads() {
		//System.out.println("enter test....");
		myProcessor.doProcess();

	}

	@Test
	public void testHello(){
	    helloInterface.sayHelllo();
    }

    @Test
    public void testBean(){

		System.out.println(person);
	}

}
