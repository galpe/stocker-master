package hello;

import hello.defaults.DefaultService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableJpaRepositories
@EnableAutoConfiguration
public class Application {

//    @Autowired
    private DefaultService defaultService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

//        DefaultService.CreateDefaults();
    }


}
