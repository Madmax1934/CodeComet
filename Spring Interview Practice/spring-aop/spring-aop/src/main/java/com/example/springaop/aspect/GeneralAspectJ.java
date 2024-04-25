package com.example.springaop.aspect;

import com.example.springaop.model.College;
import com.example.springaop.model.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
public class GeneralAspectJ {

    @Pointcut("execution(* com.example.springaop.service.*.*(..))")
    public void loggingPointCut(){}

    @Before("loggingPointCut()")
    public void before(JoinPoint joinPoint){
        System.out.println("Before Method Invoked: "+joinPoint.getSignature()+" at "
        +new SimpleDateFormat("dd/mm/yyyy hh:mm:ss").format(new Date()));
    }
//
//
    @After("loggingPointCut()")
    public void after(JoinPoint joinPoint)
    {
        System.out.println("After method invoked "+joinPoint.getSignature()+" at "
        +new SimpleDateFormat("DD/MM/YYYY hh:mm:ss:ms").format(new Date()));
    }

    @AfterReturning(value = "execution(* com.example.springaop.service.*.*(..))",returning = "clg")
    public void  afterreturning(JoinPoint joinPoint,College clg)
    {
        System.out.println("After method invoked and returning: "+joinPoint.getSignature());
        System.out.println("After method invoked and returning: "+clg.getCname());
    }

    @AfterThrowing(value = "execution(* com.example.springaop.service.*.*(..))",throwing = "ex")
    public void afterThrow(JoinPoint joinPoint,Exception ex)
    {
        System.out.println("After throwing method invoked: "+joinPoint.getSignature());
        System.out.println("Exception message "+ex.getMessage());
    }
}
