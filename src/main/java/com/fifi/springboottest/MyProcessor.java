package com.fifi.springboottest;


import com.fifi.annotation.AroundAuthority;
import com.fifi.annotation.MyAnnotation;
import com.sun.media.jfxmedia.logging.Logger;

import org.springframework.stereotype.Service;

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
