package com.fifi.springboottest;



import org.springframework.stereotype.Service;
import com.fifi.springboottest.annotation.MyAnnotation;

@Service

public class MyProcessor {

    @MyAnnotation(type = "ddd")
    public void doProcess(){
        System.out.println("Enter doProcess method......");
    }

    public void doOtherProcess(){
        System.out.println("Enter doOtherProcess method......");
    }
}
