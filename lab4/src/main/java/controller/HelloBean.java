package stupid.task.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import stupid.task.spring.annotation.MySpy;

@RestController
public class HelloBean {
    @MySpy
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value="myName", defaultValue="World") String name){
        return String.format("Hello %s!", name);
    }
    @GetMapping("/bye")
    public String sayBye(@RequestParam(value="myName", defaultValue="Cruel World") String name){
        return String.format("Bye %s!", name);
    }
}
