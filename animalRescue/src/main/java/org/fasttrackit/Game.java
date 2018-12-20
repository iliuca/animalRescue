package org.fasttrackit;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    Rescuer rescuer;
    Animal animal = new Animal();
    ArrayList<String> availableFood = new ArrayList<String>();
    ArrayList<String> availableActivities = new ArrayList<String>();

    public void start() {
        initRescuer();
        initAnimal();
        nameAnimal();
        initFood();
        initActivities();
        endGame();
    }

    private void initAnimal() {
        Animal cat = new Animal();
        cat.setAge(3);
        cat.setWeight(10);
        cat.setGender("F");
        cat.setFavouriteActivityName("playing");
        cat.setFavouriteFoodName("milk");
        cat.setHungerLevel(5);
        cat.setHapinessLevel(0);
        System.out.println("You have found a cat. Her age is "+ cat.getAge() + ". She weights " +cat.getWeight() + "kgs. " +
                "Her favourite activity is " +cat.getFavouriteActivityName() + " and her favourite food is " + cat.getFavouriteFoodName() +
                ". She is hungry and sad - you have to feed and entertain her. Good luck!");
    }


    private void initRescuer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your name (letters only) and press Enter");
        while(!scanner.hasNext("[a-zA-Z]+")) {
            System.out.println("Please enter a valid name (letters only) and press Enter");
            scanner.next();}
        String rescuerName = scanner.next();
        System.out.println("Hello " + rescuerName + "!"); }

    private void nameAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a name for your animal and press Enter");
        while(!scanner.hasNext("[a-zA-Z]+")) {
            System.out.println("Please enter a valid name (letters only) and press Enter");
            scanner.next();}
        String animalName = scanner.next();
        System.out.println("Your pet name is " + animalName +".");}

    private void initFood() {
        availableFood.add("milk");
        availableFood.add("bones");
        availableFood.add("meat");
        }


    private void initActivities() {
        availableActivities.add("running");
        availableActivities.add("playing");
        }

    private void requireFeeding() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please feed your animal with one item from the list below") ;
        for (String str : availableFood) {
            System.out.println(str);}
        String chosenFood = scanner.next();
        System.out.println("You fed your pet:  " + chosenFood + ".");
            if (chosenFood != null) {
                animal.hungerLevel--;
            }
            if (chosenFood.equals(animal.favouriteFoodName)) {
                animal.hapinessLevel++;
            }

        }

        private void requireActivity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please chose an activity for your animal, from the list below ");
         for (String str : availableActivities) {
                System.out.println(str);}
        String chosenActivity = scanner.next();
        System.out.println("Your pet had the following activity :  " + chosenActivity + ".");
        if (chosenActivity != null) {animal.hapinessLevel ++;}
        if(chosenActivity.equals(animal.favouriteActivityName)){
            animal.hapinessLevel = animal.hapinessLevel +2; }
        }

    private void showLevel() {
        System.out.println("Your animal hunger level is " + animal.hungerLevel);
        System.out.println("Your animal hapiness level is " + animal.hapinessLevel);
                }

     private boolean animalIsHungry(){
        if (animal.hungerLevel>0) {
            return true;
        } else
            return false;

     };

        private void endGame() {
           while (animal.hapinessLevel<5 || animalIsHungry()) {
               requireFeeding();
               requireActivity();
               showLevel();
           }
            System.out.println("Congratulations, your animal is now well fed and happy!");
        }
    }









