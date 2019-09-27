package com.fifi.springboottest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
//@Aspect
public class TimeMonitor {

    //@Around("execution(* com.fifi.springboottest.*.*(..))")
    public void timeMonitor(ProceedingJoinPoint pjp)throws Throwable{
        System.out.println("start....");
        pjp.proceed();
        System.out.println("end....");
    }
}
