package App;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiValueExample {

   @GetMapping
    public  String byHeader(@RequestHeader(value = "myName", required = false)String name){
       return  "Hello " + name;
   }
   @PostMapping
    public String byParam(@RequestParam(value = "myAge", required = false) Long age){
       return "You have " + age;
   }

    @RequestMapping(method = RequestMethod.POST , value = "/getHeight/{height}")
    public String byVariable(@PathVariable ("height") Long height){
        return "You have2 " + height;

    }
    @PostMapping("/sendValue")
    public String byBody(@RequestBody BSO bso){
       return bso.toString() + "przeslane przez api";
    }
}
