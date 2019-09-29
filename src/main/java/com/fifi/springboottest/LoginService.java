package com.fifi.springboottest;

import com.fifi.springboottest.annotation.AroundAuthority;
import com.fifi.springboottest.annotation.MyAnnotation;
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
