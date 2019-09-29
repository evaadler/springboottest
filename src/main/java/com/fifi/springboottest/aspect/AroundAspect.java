package com.fifi.springboottest.aspect;

import com.fifi.springboottest.annotation.AroundAuthority;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAspect {
    @Around("@annotation(around)")
    public void aroundAthority(ProceedingJoinPoint pjp, AroundAuthority around)throws Throwable{
        System.out.println("strat");

        pjp.proceed();

        System.out.println(around.methodName());
    }
}
