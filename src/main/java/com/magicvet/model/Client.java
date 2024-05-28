package main.java.com.magicvet.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");

    private String name;
    private String lastname;
    private String mail;
    private List<Pet> pets = new ArrayList<>();
    private final LocalDateTime registrationDate = LocalDateTime.now();

@Override
public String toString() {
    return "Client {"
            + "\n\tfirstName = " + name
            + ", lastname = " + lastname
            + ", email = " + mail
            + ", registration Date = " + registrationDate.format(FORMATTER)
            +"\n\tpets = " + pets
            +"\n}";
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name)
                && Objects.equals(lastname, client.lastname)
                && Objects.equals(mail, client.mail)
                && Objects.equals(pets, client.pets);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, mail, pets);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {return mail;}
    public void setPet(List<Pet> pets) {this.pets = pets;}
    public List<Pet> getPet() {return this.pets;}

    public void addPet(Pet pet){
       pets.add(pet);
    }
}


