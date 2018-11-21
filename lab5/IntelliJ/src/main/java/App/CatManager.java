package App;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.DelayQueue;


@Repository
public class CatManager {
    private List<Cat> listCats = new ArrayList<Cat>();

    public CatManager(){
        listCats.add(new Cat("kotek", 4, "kot", "spaghetti"));
        listCats.add(new Cat("kotka", 44, "kotka", "pizza"));
        listCats.add(new Cat("garfield", 2, "kot", "lasagne"));
        listCats.add(new Cat("mruczek", 11, "kot", "woda"));
    }

    public List<Cat> getCats(){
        return listCats;
    }
    public Cat getCat(int id){
        return listCats.get(id);
    }
    public void postCat(Cat cat){
        listCats.add(cat);
    }
    public void putCats(int id, Cat cat){
        listCats.set(id, cat);
    }
    public void delCat(int id){
        listCats.remove(id);
    }

}
