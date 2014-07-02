package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;

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
    // 另一種寫法指定 Content-Type
    @RequestMapping("/json2")
    public ResponseEntity<String> index_json2(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>("{\"value\": 1}", headers,
                HttpStatus.OK);
    }
}