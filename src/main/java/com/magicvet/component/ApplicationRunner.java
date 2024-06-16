package main.java.com.magicvet.component;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Client;
import main.java.com.magicvet.model.Pet;
import main.java.com.magicvet.service.ClientService;
import main.java.com.magicvet.service.PetService;

import java.lang.ref.Cleaner;

public class ApplicationRunner {
    private final EntityRegister register = new EntityRegister();

    public void run() {
        if (Authenticator.auth()){
            register.registerClients();
        }
    }
}
