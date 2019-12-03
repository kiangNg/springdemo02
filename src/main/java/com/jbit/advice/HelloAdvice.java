package com.jbit.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAdvice {
    //前置增强
    @Before(value = "execution(* com.jbit.service.*.*(..))")
    public void before(){
        System.out.println("前置增强被执行");
    }

    //后置增强
    @After(value = "execution(* com.jbit.service.*.*(..))")
    public void after(){
        System.out.println("后置增强被执行");
    }

    //异常增强
    @AfterThrowing(value = "execution(* com.jbit.service.*.*(..))",throwing = "e")
    public void trowing(Exception e){
        System.out.println("异常增强被执行"+e.getMessage());
    }

    //返回增强
    @AfterReturning(value = "execution(* com.jbit.service.*.*(..))",returning = "obj")
    public void returning(Object obj){
        System.out.println("后置返回增强被执行"+obj);
    }
    //环绕增强
    public Object around(ProceedingJoinPoint pro){
        System.out.println("前置增强被执行");
        Object obj = null;
        try{
            obj = pro.proceed(); //调用执行目标方法
            System.out.println("后置返回增强被执行"+obj);
        }catch (Throwable ex){
            ex.printStackTrace();
            System.out.println("异常增强被执行"+ex.getMessage());
        }finally {
            System.out.println("后置增强被执行");
        }
        return obj;
    }
}
