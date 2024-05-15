package main.java.com.magicvet;
import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;
import java.util.Arrays;
import java.util.Comparator;

public class Sandbox {
    public static void main(String[] args) {
        Dog[] dogs ={
                new Dog(Dog.Size.XS),
                new Dog(Dog.Size.S),
                new Dog(Dog.Size.M),
                new Dog(Dog.Size.L),
                new Dog(Dog.Size.XL)
        };
        Arrays.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getSize().getValue()-o2.getSize().getValue();
            }
        });

        for(Dog dog : dogs){
            System.out.println(dog.getSize());
        }


         /* Pet[] pets={
                new Pet(Pet.Age.Baby),
                new Pet(Pet.Age.Young),
                new Pet(Pet.Age.Adult),
                new Pet(Pet.Age.Old)
        };

        Arrays.sort(pets, new Comparator<Pet>(){
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        for(Pet pet : pets){
            System.out.println(pet.getAge());
        }*/
    }
}
