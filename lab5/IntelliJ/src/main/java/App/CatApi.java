package App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CatApi {

    private CatManager catManager;

    @Autowired

    public CatApi(CatManager catManager) {
        this.catManager = catManager;
    }

    @GetMapping("/cats")
    public List<Cat> viewCats() {
        return catManager.getCats();
    }

    @GetMapping("/cats/{id}")
    public Cat viewCat(@PathVariable(value = "id") int id) {
        return catManager.getCat(id);
    }

    @PostMapping("/cats")
    public void addCat(@RequestBody Cat cat) {
        catManager.postCat(cat);
    }

    @PutMapping("/cats/{id}")
    public void setCat(@PathVariable(value = "id") int id, @RequestBody Cat cat) {
        catManager.putCats(id, cat);
    }

    @DeleteMapping("/cats/{id}")
    public void delCat(@PathVariable(value = "id") int id) {
        catManager.delCat(id);
    }

    @PatchMapping("cat/{id}")
    public void patchDog(@PathVariable(value = "id") final int id,
                         @RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "sex", required = false) String sex,
                         @RequestParam(value = "paws", required = false) Integer numberOfPaws,
                         @RequestParam(value = "favouriteFood", required = false) String favouriteFood) {

        if (name != null)
            catManager.getCat(id).setName(name);
        if (sex != null)
            catManager.getCat(id).setSex(sex);
        if (numberOfPaws != null)
            catManager.getCat(id).setNumberOfPov(numberOfPaws);
        if (favouriteFood != null)
            catManager.getCat(id).setFavoriteFood(favouriteFood);
    }
}
