package main.java.com.magicvet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static String PASSWORD = "default";
    static Scanner scanner = new Scanner(System.in);
    static String Email_Pattern="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    static String NameLastName_Pattern="^[a-zA-Z\\-]{3,}";

    public static void main(String[] args) {
        run();
    }

    static void run() {
     if (auth()){
       registerNewClient();
     }
    }

    static void registerNewClient() {
        System.out.println("Please provide a client details");
        System.out.print("Email: ");
        String email = scanner.nextLine();

        if (isEmailValid(email)) {
            Client client =buildClient(email);
            System.out.println("New client " + client.name+ " " + client.lastname+" ("+client.mail + ")");
        }else{
            System.out.println("Provide email is invalid");
        }
    }

     static Client buildClient(String email) {
        Client client = new Client();
        client.mail = email;

         System.out.println("First name: ");
         String name = scanner.nextLine();

         if (!isNameValid(name)) {
             System.out.println("Provide name is invalid");
         }else{client.name = name;}

         System.out.print("Last name: ");
         String lastName = scanner.nextLine();

         if (!isLastNameValid(lastName)) {
             System.out.println("Provide Lastname is invalid");
         }else{client.lastname = lastName;}

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

    static boolean auth(){
        boolean accepted = true;
        for(int i =0; i<3; i++){
            System.out.println("Password: ");
            String input = scanner.nextLine();

            if(PASSWORD.equals(input)){
                accepted = true;
                break;
            }else {
                System.out.println("Access denided.Please check your password");
            }
        }
        System.out.println(accepted ? "Welcome to the Magic Vet!" : "Application has been blocked.");

        return accepted;

    }

}