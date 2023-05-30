package com.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 罗霖荃
 * @version 1.0
 */
@Slf4j //记录日志
@Component
@Aspect //表示是一个aop类,用于测试方法所消耗的时间
public class TimeAspect {
    @Around("execution(* com.example.Service.*.*(..))")
    public Object SubTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //1.开始时间
        long begin = System.currentTimeMillis();
        //2.执行方法
        Object proceed = proceedingJoinPoint.proceed();
        //3.计算结束总时间
        long end = System.currentTimeMillis();
        log.info(proceedingJoinPoint.getSignature() + "方法运行所需要的时间为：{}ms",end - begin);
        return proceed;
    }
}
