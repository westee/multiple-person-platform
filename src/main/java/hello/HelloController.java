package hello;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(@RequestParam("user") String id ) {
        return  String.format("<html><body>我是隔壁老王%s</body></html>", id);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password){
        System.out.println("username: " + username + "password: " + password);
        return "";
    }

    @RequestMapping("/whoami")
    public String whoami(){
        return UUID.randomUUID().toString();
    }
}