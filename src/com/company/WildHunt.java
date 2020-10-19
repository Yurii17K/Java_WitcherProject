package com.company;

public class WildHunt {

    //Initializing
    private Witcher kidnapped; //Composition


    //Assigning values
    private static int hunters_num = 0;


    //Getters
    public static int get_hunters_num () {
        return hunters_num;
    }


    //Constructors
    WildHunt () {

        hunters_num++;
    }


    //Methods
    public void kidnapWitcher (Witcher witcher) {

        this.kidnapped = witcher;
    }

    public String show_kidnapped() {
        return kidnapped.get_name();
    }

}
