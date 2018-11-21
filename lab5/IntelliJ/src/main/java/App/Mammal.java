package App;

public class Mammal {
   private String name;
   private int numberOfPov;
   private String sex;

    public Mammal(String name, int numberOfPov, String sex){
        this.name = name;
        this.numberOfPov = numberOfPov;
        this.sex = sex;
    }

    public Mammal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPov() {
        return numberOfPov;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNumberOfPov(int numberOfPov) {
        this.numberOfPov = numberOfPov;
    }

    @Override
    public String toString() {
        return  " name " + name + " number of pov " + numberOfPov + " sex " +sex ;
    }
}
