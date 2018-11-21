package App;

public class Cat extends Mammal {

    String favoriteFood;

    public Cat() {
    }

    public Cat(String name, int numberOfPov, String sex, String favoriteFood) {
        super(name, numberOfPov, sex);
        this.favoriteFood = favoriteFood;
    }


    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Override
    public String toString() {
        return  "favoriteFood: " + favoriteFood ;
    }



}
