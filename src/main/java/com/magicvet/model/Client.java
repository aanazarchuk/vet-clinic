package main.java.com.magicvet.model;

public class Client {
    private String name;
    private String lastname;
    private String mail;
    private Pet pet;

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

    public String getMail() {
        return mail;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet(Pet pet) {
        return pet;
    }
}
