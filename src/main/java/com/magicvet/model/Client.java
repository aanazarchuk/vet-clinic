package main.java.com.magicvet.model;

import java.util.Objects;

public class Client {
    private String name;
    private String lastname;
    private String mail;
    private Pet pet;

@Override
public String toString() {
    return "Client {"
            + "\n\tfirstName = " + name
            + ", lastname = " + lastname
            + ", email = " + mail
            +"\n\tpet = " + pet
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
                && Objects.equals(pet, client.pet);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, mail, pet);
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

    public String getMail() {
        return mail;
    }
        public void setPet(Pet pet) {
            this.pet = pet;
        }

    public Pet getPet() {
        return this.pet;
    }
}


