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
    public String[] index_json(){
        return new String[] {"a", "b"};
    }

    // content-type set by self
    @RequestMapping("/json2")
    public ResponseEntity<String> index_json(HttpServletResponse response){
        HttpHeaders headers = new HttpHeaders();
        // headers.setContentType(MediaType.TEXT_PLAIN);
        headers.set("content-type", "application/json; charset=UTF-8");
        return new ResponseEntity<String>("{\"value\": 1}", headers,
                HttpStatus.OK);
    }
}