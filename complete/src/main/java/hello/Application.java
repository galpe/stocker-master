package hello;

import hello.defaults.DefaultService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

//    @Autowired
    private DefaultService defaultService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

//        DefaultService.CreateDefaults();
    }


}
