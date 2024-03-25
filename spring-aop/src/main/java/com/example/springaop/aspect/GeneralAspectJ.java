package com.example.springaop.aspect;

import com.example.springaop.model.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GeneralAspectJ {

    @Pointcut("execution(* com.example.springaop.service.*.*(..))")
    public void loggingPointCut(){}

//    @Before("loggingPointCut()")
//    public void before(JoinPoint joinPoint){
//        System.out.println("Before Method Invoked: "+joinPoint.getSignature());
//    }
//
//    @After("loggingPointCut()")
//    public void after(JoinPoint joinPoint){
//        System.out.println("After Method Invoked: "+joinPoint.getSignature());
//    }


//    @AfterReturning(value = "execution(* com.example.springaop.controller.*.*(..))",returning = "student")
//    public void afterret(JoinPoint joinPoint, Student student){
//        System.out.println("After returning method invoked: "+student);
//    }
//
//    @AfterThrowing(value = "execution(* com.example.springaop.controller.*.*(..))",throwing = "e")
//    public void afterthrow(JoinPoint joinPoint, Exception e){
//        System.out.println("After throwing method invoked: "+e.getMessage());
//    }

    @Around("loggingPointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Before Method invoked: "+proceedingJoinPoint.getSignature());
        Object object = proceedingJoinPoint.proceed();

        if(object instanceof Student)
            System.out.println("After method invoked: "+proceedingJoinPoint.getSignature());
        else
            System.out.println("After method invoked: "+proceedingJoinPoint.getSignature());

        return object;
    }
}
