package au.com.anonymint;

import au.com.anonymint.model.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * //TODO description of this Application
 *
 * @author <a href="mailto:ekalak.rengwanidchakul@anonymint.com">erengwa</a>
 * @date 2014-01-29
 */

@RestController
@EnableAutoConfiguration
@ComponentScan
public class Application {

    @RequestMapping("/")
    HelloWorld main() {
        return new HelloWorld("Hello World", 1.0);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
