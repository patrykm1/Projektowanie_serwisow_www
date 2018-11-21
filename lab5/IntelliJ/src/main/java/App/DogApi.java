package App;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class DogApi {

    private DogManager dogManager;
    @Autowired

    public DogApi(DogManager dogManager) {
        this.dogManager = dogManager;
    }
    @GetMapping("/dogs")
    public List<Dog> viewDogs(){
        return dogManager.getDogs();
    }
    @GetMapping("/dogs/{id}")
    public Dog viewDog(@PathVariable(value = "id")int id){
        return dogManager.getDog(id);
    }

    @PostMapping("/dogs")
    public void addDog(@RequestBody Dog dog){
        dogManager.postDog(dog);
    }
    @PutMapping("/dogs/{id}")
    public void setDogs(@PathVariable(value = "id")int id, @RequestBody Dog dog){
        dogManager.putDogs(id, dog);
    }
    @DeleteMapping("/dogs/{id}")
    public void deleteDog(@PathVariable(value = "id")int id){
        dogManager.delDog(id);
    }
    @PatchMapping("dog/{id}")
    public void patchDog(@PathVariable(value = "id") final int id,
                         @RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "sex", required = false) String sex,
                         @RequestParam(value = "paws", required = false) Integer numberOfPaws,
                         @RequestParam(value = "race", required = false) String race) {

        if (name != null)
            dogManager.getDog(id).setName(name);
        if (sex != null)
            dogManager.getDog(id).setSex(sex);
        if (numberOfPaws != null)
            dogManager.getDog(id).setNumberOfPov(numberOfPaws);
        if (race != null)
            dogManager.getDog(id).setRasa(race);

    }

}
