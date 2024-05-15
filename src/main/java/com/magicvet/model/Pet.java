package main.java.com.magicvet.model;

import java.util.Objects;

public abstract class Pet {
    private  String type;
    private  String sex;
    private  String name;
    private  Age age;

    private  String ownerName;

    public Pet(){};
    public Pet(Age age){
        this.age=age;
    }

    @Override
    public String toString() {
        return "type = " + type +
                " , sex = " + sex +
                " , name = " + name +
                " , age = " + age +
                " , owner name = " + ownerName +
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
                Objects.equals(ownerName, pet.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sex, name, ownerName);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(Age age) {
        this.age = age;
    }
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

    public enum Age{
        Baby(1),Young(2),Adult(3),Old(4),UNKNOWN(0);

        private final int age;
        Age(int age){
            this.age=age;
        }

        public int getAge() {
            return age;
        }
    }
}
