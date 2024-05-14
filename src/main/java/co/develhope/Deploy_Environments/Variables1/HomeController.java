package co.develhope.Deploy_Environments.Variables1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HomeController {
    @Autowired
    Environment environment;
    @GetMapping("/authCode")
    public String getAuthCode(){
       String authCode = environment.getProperty("authCode");
       String devName = environment.getProperty("devName");
       return "Hi " + devName + " the author code is: " + authCode;
    }
}
