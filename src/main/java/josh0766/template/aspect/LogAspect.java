package josh0766.template.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogAspect {
    @Before("execution(* josh0766.template.controller.ContentController.*(..))")
    public void before (JoinPoint joinPoint) throws Throwable {
        log.info("before....1");
    }

    @Around("execution(* josh0766.template.controller.ContentController.*(..))")
    public Object logging (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("before");
        Object result = proceedingJoinPoint.proceed();
        log.info("after");

        return result;
    }

    @After("execution(* josh0766.template.controller.ContentController.*(..))")
    public void after (JoinPoint joinPoint) throws Throwable {
        log.info("after....1");
    }
}
