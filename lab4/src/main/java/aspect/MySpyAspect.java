package stupid.task.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Aspect
@Component
public class MySpyAspect {
    @Around("@annotation(stupid.task.spring.annotation.MySpy)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println(joinPoint.getSignature() + " called at " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        return joinPoint.proceed();
    }
}
