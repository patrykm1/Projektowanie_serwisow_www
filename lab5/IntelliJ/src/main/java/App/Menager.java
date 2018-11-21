package App;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Menager {

    public static List<Mammal> listMammals = new ArrayList<Mammal>();

    public static List<Mammal> getListMammals() {
        return listMammals;
    }

    public void doListy(){
        for (int i=1; i<5; i++){
            listMammals.add(new Cat( "cat",  i,  "w",  "lasagne"));
            listMammals.add(new Dog("dog", i, "m", "owczarek"));
    }

   /* public void  addDog(Dog dog){
        listMammals.add(dog);
    }
    public void addCat(Cat cat){
        listMammals.add(cat);
    }

    public void showMammal(){
        for (Mammal mammal: listMammals
                 ) {
            System.out.println(mammal);
        }
    }*/


}
}