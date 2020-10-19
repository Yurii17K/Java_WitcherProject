package com.company;

public class Monster extends Witcher{

    //Initializing
    private static int monsters_num;


    //Assigning values
    static {
        monsters_num = 1;
    }


    //Getters
    public static int get_monsters_num() {
        return monsters_num;
    }


    //Constructors
    Monster(String name, int age) {
        super(name, age);
        decrease_witchers_num();
    }


    //Methods
    public void intro() {
        System.out.println(this.get_name() + " is the " + this.get_monsters_num() + " monster");
    }

}
