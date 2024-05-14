package main.java.com.magicvet.model;

import java.util.Objects;

public abstract class Pet {
    private  String type;
    private  String sex;
    private  String name;
    private  String  age;
    public static final String baby = "baby";
    public static final String young = "young";
    public static final String adult = "adult";
    public static final String old = "old";

    private  String ownerName;

    public Pet(){};
    public Pet(String age){
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
                Objects.equals(age, pet.age) &&
                Objects.equals(ownerName, pet.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sex, name, age, ownerName);
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

    public String getAge(String s) {
        return age;
    }

    public void setAge(String  age) {
        this.age = age;
    }

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
}
