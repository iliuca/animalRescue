package org.fasttrackit;
//this class represents the app user
public class Rescuer {
    String name;

    public static void feed(Animal animal, String food){

        animal.hungerLevel --;
        if (food.equals(animal.favouriteFoodName)){
        animal.hapinessLevel++;}
    }

    public void entertain (Animal animal, String activity){
        animal.hapinessLevel++;
        if(activity.equals(animal.favouriteActivityName)){
            animal.hapinessLevel = animal.hapinessLevel +2;
        }
    }
}
