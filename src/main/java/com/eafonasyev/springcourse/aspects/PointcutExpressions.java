package com.eafonasyev.springcourse.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutExpressions {

    @Pointcut("execution(* com.eafonasyev.springcourse.dao.*.*(..))")
    public  void forDaoPkg(){};

    @Pointcut("execution(* com.eafonasyev.springcourse.dao.*.get*(..))")
    public  void getter(){};

    @Pointcut("execution(* com.eafonasyev.springcourse.dao.*.set*(..))")
    public  void setter(){};

    @Pointcut("execution(* com.eafonasyev.springcourse.dao.AccountDao.findAccounts(..))")
    public  void forFindAccounts(){};


    @Pointcut("forDaoPkg() && !(setter() || getter())")
    public  void forDaoPkgNotGetSet(){};




}
