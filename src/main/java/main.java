import java.util.ArrayList;

public class main {



    //  ArrayList<Animal> animalList = new ArrayList<Animal>();
    public static void main(String[] args) {
        Animal[] animalList = new Animal[3];
        Dog dogOne = new Dog("Michael", "LAb Dog");
        animalList[0] = dogOne;
        Hippo BigFatDude = new Hippo("Mikaila", "OverWeight Hippo");
        animalList[1] = BigFatDude;
        Tiger littleKitty = new Tiger("Pussy", "Tropical pussy");
        animalList[2] = littleKitty;
        AnimalSpeak(animalList);

    }
    public static void AnimalSpeak(Animal[] A){
       for(Animal animals : A){
           System.out.println(animals.speak());
       }

    }
}
