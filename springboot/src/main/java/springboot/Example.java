package springboot;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/*
 * The @RestController and @RequestMapping annotations 
 * are Spring MVC annotations (they are not specific to Spring Boot).
 * 
 * @RestController. This is known as a stereotype annotation. 
 * It provides hints for people reading the code, and for Spring, 
 * that the class plays a specific role. 
 * In this case, our class is a web @Controller so Spring will consider it 
 * when handling incoming web requests.
 * 
 * The second class-level annotation is @EnableAutoConfiguration. 
 * This annotation tells Spring Boot to “guess” how you will want to configure Spring, 
 * based on the jar dependencies that you have added.
 * Since spring-boot-starter-web added Tomcat and Spring MVC, 
 * the auto-configuration will assume that you are developing a web application and 
 * setup Spring accordingly.
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}