package main.java.com.magicvet.service;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;

public class PetService {
    private static final String DOG_TYPE = "dog";

    public Pet registerNewPet(){
        Pet pet = new Pet();
        System.out.print("Type (dog/cat/other): ");

        String type= Main.scanner.nextLine();

        if(DOG_TYPE.equals(type)) {
            pet = buildDog();
        }else{
            pet =buildPet(type);
        }
        return pet;
    }

    private Pet buildPet(String type) {
        Pet pet = new Pet();
        pet.setType(type);
        System.out.print("Age: ");
        pet.setAge(Main.scanner.nextLine());

        System.out.print("Name: ");
        pet.setName(Main.scanner.nextLine());

        System.out.print("Sex(male/female): ");
        pet.setSex(Main.scanner.nextLine());
        return pet;
    }

    private Dog buildDog() {
        Pet pet = buildPet(DOG_TYPE);
        Dog dog =petToDog(pet);

        System.out.print("Size(xs/s/m/l/xxl): ");
        dog.setSize(Main.scanner.nextLine());
        return dog;
    }

    private Dog petToDog(Pet pet) {
        Dog dog = new Dog();
        dog.setAge(pet.getAge());
        dog.setName(pet.getName());
        dog.setSex(pet.getSex());

        return dog;
    }
}
