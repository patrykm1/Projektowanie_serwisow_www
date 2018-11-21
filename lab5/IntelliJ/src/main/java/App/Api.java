package App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import  java.util.List;
@RestController
public class Api {
   // private final Object menager;
    //
   @Autowired
    private Menager menager;
//
//    @Autowired
//    public Api(Menager menager) {
//        this.menager = menager;
//    }

//    @Autowired
//    public void setMenager(App.Menager menager) {
//
//                this.menager = menager;
//    }


    @GetMapping("/ba")
    public List<Mammal> nazwa(){
        return menager.getListMammals();
    }

    @GetMapping("/pets")
    public ResponseEntity<List<Mammal>>  pets()
    {
    ResponseEntity <List<Mammal>> listResponseEntity=
            new ResponseEntity<List<Mammal>>(menager.getListMammals(), HttpStatus.OK);
        return listResponseEntity;
    }
    @GetMapping("/notWorkPets")
    public ResponseEntity<List<Mammal>>  notWorkPets()
    {
        ResponseEntity <List<Mammal>> listResponseEntity=
                new ResponseEntity<List<Mammal>>(menager.getListMammals(), HttpStatus.INTERNAL_SERVER_ERROR);
        return listResponseEntity;
    }

    @GetMapping("/add")
    public void addPet(){
        menager.doListy();
    }

}
