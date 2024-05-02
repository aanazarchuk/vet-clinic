package main.java.com.magicvet.component;

import main.java.com.magicvet.model.Client;
import main.java.com.magicvet.model.Pet;
import main.java.com.magicvet.service.ClientService;
import main.java.com.magicvet.service.PetService;

public class ApplicationRunner {
    private static ClientService clientService = new ClientService();
    private PetService petService =new PetService();

    public void run() {
        if (Authenticator.auth()){
            Client client = clientService.registerNewClient();

        if(client!=null){
            System.out.println("Adding a new pet");

            Pet pet =petService.registerNewPet();
            client.getPet(pet);
            pet.setOwnerName(client.getName()+ " " + client.getLastname());
            System.out.println("Pet has been added!");
        }
        }
    }


}
