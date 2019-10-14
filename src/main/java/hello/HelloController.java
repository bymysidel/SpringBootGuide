package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
   int i = 2;
    @RequestMapping("/")
    public String index() {
        System.out.println(i);
        int i = 1;
        System.out.println(i);
        return "Greetings from Spring Boot!";
    }

}