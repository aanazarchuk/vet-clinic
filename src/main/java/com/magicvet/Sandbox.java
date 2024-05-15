/*package main.java.com.magicvet;

import main.java.com.magicvet.comparator.DogSizeComparator;
import main.java.com.magicvet.comparator.PetAgeComparator;
import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;

import java.util.Arrays;

public class Sandbox {
    public static void main(String[] args) {
        Dog[] dogs ={
                new Dog(Dog.XS),
                new Dog(Dog.L),
                new Dog(Dog.Xl),
                new Dog(Dog.Xl),
                new Dog(Dog.M),
                new Dog(Dog.S)
        };
        Arrays.sort(dogs, new DogSizeComparator());

        for(Dog dog : dogs){
            System.out.println(dog.getSize(Main.scanner.nextLine()));
        }


        Pet[] pets={
                new Pet(Pet.baby),
                new Pet(Pet.adult),
                new Pet(Pet.baby),
                new Pet(Pet.young)
        };

        Arrays.sort(pets, new PetAgeComparator());

        for(Pet pet : pets){
            System.out.println(pet.getAge(Main.scanner.nextLine()));
        }
    }
}
*/