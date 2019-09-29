package com.fifi.springboottest;


import com.fifi.springboottest.annotation.MyAnnotation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomerAnnotation {

   // @Pointcut("execution(public * com.taotao.service.*.*(..)) && @annotation(com.taotao.annotation.MyAnnotation)")
   // public void checkAcivity(){}

   // @Around("checkAcivity()")
    @Around("@annotation(com.fifi.springboottest.annotation.MyAnnotation))")
    public Object process(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("test aop .....");

        /*
        if (an.type().equalsIgnoreCase("cc")) {
            System.out.println("............!!!!!");
            return proceedingJoinPoint.proceed();
        }*/

       // return proceedingJoinPoint.proceed();
        return null;
    }


}
