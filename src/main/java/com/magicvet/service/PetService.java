package main.java.com.magicvet.service;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Cat;
import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;

import java.util.Arrays;
import java.util.Locale;

public class PetService {
    private static final String DOG_TYPE = "dog";
    private static final String CAT_TYPE = "cat";

    public Pet registerNewPet(){
        Pet pet = null;

        System.out.print("Type (dog/cat): ");
        String type= Main.scanner.nextLine();

        if(DOG_TYPE.equals(type)||CAT_TYPE.equals(type)) {
            pet = buildPet(type);
        }else{
            System.out.println("Unknown pet type "+type);;
        }
        return pet;
    }

    private Pet buildPet(String type) {
        Pet pet = type.equals(CAT_TYPE)? new Cat() : new Dog();
        pet.setType(type);

        System.out.print("Age(Baby,Young,Adult,Old): ");
        String age=Main.scanner.nextLine().toUpperCase();
        pet.setAge(Pet.Age.valueOf(age));

        System.out.print("Name: ");
        pet.setName(Main.scanner.nextLine());

        System.out.print("Sex(male/female): ");
        pet.setSex(Main.scanner.nextLine());

        System.out.print("Healthy state (Healthy,Sick,Chronic disease,Trauma: ");
        String healthstate=Main.scanner.nextLine().toUpperCase();
        pet.setHealthState(Pet.HealthState.valueOf(healthstate));
        
        if(type.equals(DOG_TYPE)){
            System.out.println("Size(xs/s/m/l/xxl): ");
            String size=Main.scanner.nextLine().toUpperCase();
            ((Dog)pet).setSize(Dog.Size.valueOf(size));
            System.out.println();
        }
        return pet;
    }

}
