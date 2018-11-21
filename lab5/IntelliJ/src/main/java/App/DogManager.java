package App;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DogManager {
    private List<Dog> listDogs = new ArrayList<Dog>();

    public DogManager(){
        listDogs.add(new Dog("burek", 3, "pies", "buldog"));
        listDogs.add(new Dog("rex", 4, "pies2", "jamnik"));
        listDogs.add(new Dog("azor", 13, "pies3", "labrador"));
        listDogs.add(new Dog("szarik", 9, "pies4", "owczarek"));
    }

    public List<Dog>getDogs(){
        return listDogs;
    }
    public Dog getDog(int id){
        return listDogs.get(id);
    }

    public void postDog(Dog dog){
        listDogs.add(dog);
    }
    public void putDogs(int index, Dog dog){
        listDogs.set(index, dog);
    }
    public void delDog(int id){
        listDogs.remove(id);
    }
    public void patchDog(int index, Dog dog){
        listDogs.set(index, dog);
    }
}
