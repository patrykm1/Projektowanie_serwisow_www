package App;

public class Dog extends Mammal {

    String rasa;

    public Dog() {

    }

    public Dog(String name, int numberOfPov, String sex, String rasa) {
        super(name, numberOfPov, sex);
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    @Override
    public String toString() {
        return  " rasa " + rasa;
    }
}
