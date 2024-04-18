package main.java.com.magicvet;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static String PASSWORD = "defaul";
    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
      run();
    }

    static void run (){
        boolean accepted = false;
        for(int i = 0; i<3; i++){
            System.out.print("Password: ");
            String input = scanner.nextLine();

            if (PASSWORD.equals(input)) {accepted =true; break;}
            else {
                System.out.println("Access denied.Please check your password.");
            }
        }
        System.out.println(accepted ? "Welcome to the Magic-vet" : "Application has been blocked");
    }
}