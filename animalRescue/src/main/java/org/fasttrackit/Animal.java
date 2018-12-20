package org.fasttrackit;

public class Animal {

    static String name;
    String gender;
    double age;
    double weight;
    int hungerLevel = 5;
    int hapinessLevel = 0;
    String favouriteActivityName = "running";
    String favouriteFoodName = "meat" ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHapinessLevel() {
        return hapinessLevel;
    }

    public void setHapinessLevel(int hapinessLevel) {
        this.hapinessLevel = hapinessLevel;
    }

    public String getFavouriteActivityName() {
        return favouriteActivityName;
    }

    public void setFavouriteActivityName(String favouriteActivityName) {
        this.favouriteActivityName = favouriteActivityName;
    }

    public String getFavouriteFoodName() {
        return favouriteFoodName;
    }

    public void setFavouriteFoodName(String favouriteFoodName) {
        this.favouriteFoodName = favouriteFoodName;
    }
}
