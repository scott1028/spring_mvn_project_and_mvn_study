package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {
    // text/plain
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot by Scott!";
    }

    // application/json 自動轉型態的
    @RequestMapping("/json")
    public String[] index_json(HttpServletResponse response){
        return new String[] {"a", "b"};
    }
}