package com.company;

public class Mutant extends Witcher {

    //Initializing
    private static int mutants_num;


    //Assigning values
    static {
        mutants_num = 1;
    }


    //Getters
    public static int get_mutants_num() {
        return mutants_num;
    }


    //Constructors
    Mutant(String name, int age) {
        super(name, age);
        decrease_witchers_num();
    }


    //Methods
    @Override
    public void attacks() {
        System.out.println(get_name() + ": I'll kill all " + super.get_witchers_num() +" witcher/s");
    }

    public void intro() {
        System.out.println(this.get_name() + " is the " + this.get_mutants_num() + " mutant");
    }



}
