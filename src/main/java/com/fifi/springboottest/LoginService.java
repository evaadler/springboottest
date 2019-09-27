package com.fifi.springboottest;
import	java.lang.reflect.Type;

import com.fifi.annotation.AroundAuthority;
import com.fifi.annotation.MyAnnotation;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

@Component("LoginService")
public class LoginService {

    @AroundAuthority(methodName = "getMessage")

    public String getMessage(){
        System.out.println("hello");

        return "Hello world";
    }

    @AroundAuthority(methodName = "loginIn")
    public String loginIn(String username, String pwd){
        System.out.println("enter");
        return "111";
    }
}
