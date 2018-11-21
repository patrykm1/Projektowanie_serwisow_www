
package App;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Patryk
 */
@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public  String sayHello() {
        //System.out.println("test!!!!");
        return "Hello world";
    }
    @GetMapping("/")
    public  String sayHi() {
        //System.out.println("test!!!!");
        return "Dziala!";
    }
}
