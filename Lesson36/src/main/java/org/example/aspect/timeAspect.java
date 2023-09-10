package org.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
@Aspect
public class timeAspect {
    @Pointcut("@annotation(org.example.BenchTime)")
    public void pointTime(){};

   @Around("pointTime()")
    public void timeProcess(ProceedingJoinPoint point) throws Throwable {
       Long start=System.nanoTime();
        point.proceed();
       System.out.println("Время забега составило: "+(System.nanoTime()-start)/1000000000+" сек.");

    }
}
