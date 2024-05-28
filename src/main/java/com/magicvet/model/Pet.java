package main.java.com.magicvet.model;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Pet {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
    private  String type;
    private  String sex;
    private  String name;
    private  Age age;
    private HealthState healthState;
    private  String ownerName;
    private final LocalDateTime registrationDate = LocalDateTime.now();

    public Pet(){};

    @Override
    public String toString() {
        return "type = " + type +
                " , sex = " + sex +
                " , name = " + name +
                " , age = " + age +
                " , owner name = " + ownerName +
                " , health state = " + healthState +
                " , registration Date = " + registrationDate.format(FORMATTER) +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(type, pet.type) &&
                Objects.equals(sex, pet.sex) &&
                Objects.equals(name, pet.name) &&
                Objects.equals(age, pet.age) &&
                Objects.equals(ownerName, pet.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sex, name, ownerName);
    }

    public HealthState getHealthState() {return healthState;}

    public void setHealthState(HealthState healthState) {this.healthState = healthState;}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {this.sex = sex;}

    public void setAge(Age age) {this.age = age;}
    public Age getAge() {return age;}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public enum  Age{
        BABY("Baby"),YOUNG("Young"),ADULT("Adult"),OLD("Old"),DEFAULT(null);

        private final String value;

        Age(String value){this.value=value;}

        public String  getValue() {
            return value;
        }
    }

    public enum HealthState {
        HEALTHY("Healthy"), SICK("Sick"), CHRONIC("Chronic"), TRAUMA("Trauma"),DEFAULT(null);

        private final String healthState;

        HealthState(String healthState) {
            this.healthState = healthState;
        }

        public String getHealthState() {
            return healthState;
        }
    }

}
