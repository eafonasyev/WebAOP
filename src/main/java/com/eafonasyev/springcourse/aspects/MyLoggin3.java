package com.eafonasyev.springcourse.aspects;

import com.eafonasyev.springcourse.dao.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(1)
public class MyLoggin3 {


    @Before("PointcutExpressions.forDaoPkgNotGetSet()")
    public void  beforeAddAccount3(JoinPoint point){

        MethodSignature signature = (MethodSignature) point.getSignature();

        System.out.println("method signature "+signature);

        Object[] arg = point.getArgs();

        for(Object tempArg : arg){
            System.out.println("account arg  " + tempArg+"  NAME");

            if (tempArg instanceof  Account){
            Account account = (Account) tempArg;
            System.out.println(account.getName());
            System.out.println(account.getLevel());
            }
        }

        System.out.println("before same execution 3");
    }
    @AfterReturning(pointcut = "PointcutExpressions.forFindAccounts()",
                    returning = "result"
    )
    public void getAfterRetuningAdvise(JoinPoint point, List<Account> result){
        for(Account ac : result){
            System.out.print(ac.getName()+" ");
            System.out.println(ac.getLevel());
        }
        System.out.println("afterretuning is running now");
    }


}
