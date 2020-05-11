package com.eafonasyev.springcourse.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyLoggin1 {


//    @Before("PointcutExpressions.forDaoPkgNotGetSet()")
//    public void  beforeAddAccount1(){
//        System.out.println("before same execution 1");
//    }



}
