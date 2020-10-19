package com.company;

import java.util.Random;

public class Witcher {

    //Useful stuff
    Random rand = new Random();


    //Initializing
    private String name;
    private int age;
    private String school;

    private static int witchers_num;


    //Assigning values
    static {
        witchers_num = 0;
    }


    //Getters
    public static int get_witchers_num () {
        return witchers_num;
    }

    public void decrease_witchers_num() {
        this.witchers_num--;
    }

    public int get_age() {
        return age;
    }

    public String get_name() {
        return name;
    }


    //Constructors
    Witcher (String name, int age) {

        this.name = name;
        this.age = age;

        witchers_num++;

        intro();
    }

    Witcher (String name, int age, String school) {

        this(name, age);
        this.school = school;
    }


    //Methods
    public void attacks() {
        System.out.println("Witcher " + this.name + " dealt " + sword1.get_sword_power() + "dmg");
    }

    public void intro() {
        System.out.println(this.get_name() + " is the " + this.get_witchers_num() + " witcher");
    }


    //Classes
    class Sword {
        private int power = rand.nextInt(200);

        public int get_sword_power() {
            return power;
        }

    }


    //Objects
    Sword sword1 = new Sword();


}
