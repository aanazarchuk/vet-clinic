package main.java.com.magicvet.comparator;

import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;

import java.util.Comparator;

public class PetAgeComparator implements Comparator<Pet> {

    @Override
    public int compare(Pet pet1, Pet pet2) {
        return convertAge(pet1.getAge()) - convertAge(pet2.getAge());
    }

    private static int convertAge(String age){
        return switch (age){
            case Pet.baby -> 1;
            case Pet.young -> 2;
            case Pet.adult -> 3;
            case Pet.old -> 4;
            default -> 0;
        };
    }
}
