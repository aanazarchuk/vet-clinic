package main.java.com.magicvet.service;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientService {
    private static final String Email_Pattern="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final String NameLastName_Pattern="^[a-zA-Z\\-]{3,}";

    public Client registerNewClient() {
        Client client = null;

        System.out.println("Please provide a client details");
        System.out.print("Email: ");
        String email = Main.scanner.nextLine();

        if (isEmailValid(email)) {
            client =buildClient(email);
            System.out.println("New client " + client.getName()+ " " + client.getLastname()+
                    " ("+client.getMail() + ")");
        }else{
            System.out.println("Provide email is invalid");
        }
        return client;
    }
    private static Client buildClient(String email) {
        Client client = new Client();
        client.setMail(email);

        System.out.print("First name: ");
        String name = Main.scanner.nextLine();

        if (!isNameValid(name)) {
            System.out.println("Provide name is invalid");
        }else{client.setName(name);}

        System.out.print("Last name: ");
        String lastName = Main.scanner.nextLine();

        if (!isLastNameValid(lastName)) {
            System.out.println("Provide Lastname is invalid");
        }else{client.setLastname(lastName);}

        return client;
    }

    static boolean isNameValid(String name){
        Pattern pattern = Pattern.compile(NameLastName_Pattern);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    static boolean isLastNameValid(String lastname){
        Pattern pattern = Pattern.compile(NameLastName_Pattern);
        Matcher matcher = pattern.matcher(lastname);
        return matcher.matches();
    }

    static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(Email_Pattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
