package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {


        //Useful stuff
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("\n  Whatever, lets start:\n");


        //Initializing
        final int N = 2;
        Witcher witchers[] = new Witcher[3];
        WildHunt hunters[] = new WildHunt[N];
        Mutant mutants[] = new Mutant[2];
        Monster monsters[] = new Monster[1];


        //Creating witchers, hunters, mutants
        System.out.println("Chose ur witcher's name:");
        String witchers_name = in.nextLine();           //Getting input from a user
        System.out.println("Chose ur witcher's age:");
        int witchers_age = in.nextInt();
        
        witchers[0] = new Witcher(witchers_name, witchers_age, "Wolf");
        witchers[1] = new Witcher("Visemir", 286);
        witchers[2] = new Witcher("Ciri", 24);
        System.out.println("I'm " + new Witcher("Yennifer", 26).get_name() + ", a new anonymous witcher");

        print_names("Gerald", "Ciri"); //Just a fun usage of VarArgs

        for (int y = 0; y < N; ++y){
            hunters[y] = new WildHunt();
        }

        mutants[0] = new Mutant("RandomMutant", 999);
        monsters[0] = new Monster("RandomMonster", 111);

        System.out.println("\n  ACTION!!!:");


        //Actions
        witchers[0].attacks();
        mutants[0].attacks();


        //Kidnapping witchers
        System.out.println();
//        hunters[0].kidnapWitcher(witchers[rand.nextInt(2)]);
//        hunters[1].kidnapWitcher(witchers[rand.nextInt(2)]);
        for (int y = 0; y < N; ++y){

            hunters[y].kidnapWitcher(witchers[rand.nextInt(3)]);
        }


        //Showing kidnapped witchers
        for (int y = 0; y < N; ++y){

            System.out.println("Witcher " + hunters[y].show_kidnapped() + " was kidnapped");
        }


        //Showing numbers of witchers and hunters
        System.out.println("\n  Statistics:");
        System.out.println("Num of hunters " + WildHunt.get_hunters_num());
        System.out.println("Num of witchers " + Witcher.get_witchers_num());
        System.out.println("Num of mutants " + Mutant.get_mutants_num());
        System.out.println("Num of monsters " + Monster.get_monsters_num());
    }


    //Just a fun usage of VarArgs (method)
    private static void print_names(String... names) {
        for (int y = 0; y <= 30; ++y)
            switch (y) {
                case 0:
                    System.out.print('|');
                    break;
                case 30:
                    System.out.print('|');
                    break;
                default:
                    System.out.print("---");
            }
        System.out.println("\n|                                 " + names[0] + " and " + names[1] + " forever                               |");
        for (int y = 0; y <= 30; ++y)
            switch (y) {
                case 0:
                    System.out.print('|');
                    break;
                case 30:
                    System.out.print('|');
                    break;
                default:
                    System.out.print("---");
            }
        System.out.println();
    }
}
