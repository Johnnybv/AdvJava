package us.JohnErickson;

import us.JohnErickson.IO.FileInput;

import java.util.ArrayList;
import java.util.Scanner;
/**
*   Unit One Project - Main.java
*   Opens Places.csv and Reads the File then Matches to stuff.csv and Combines similar information,
*   then Prints that information to the screen in the Proper Format
*
*   @author John Erickson
*   @version .0623
*/

public class Main {

    private final static FileInput places = new FileInput("places.csv");
    private final static FileInput stuff = new FileInput("stuff.csv");
    private static Scanner keyboard = new Scanner(System.in);
    private static ArrayList<CountryCityStuff> cCs = new ArrayList<>();

    /**Main Method Calls other methods to create Unit One Project Steps and Output and Closes File*/
    public static void main(String[] args){

        setArraylist();

        findStuff();

        printFormat();

        places.fileClose();
        stuff.fileClose();
    }

    /** Method to loop through the places.csv and put into an Arraylist*/
    public static void setArraylist(){
        String line;
        String[] fields;
        String name = "";
        int counter = -1;
        while((line = places.fileReadLine()) != null){
            fields = line.split(",");
            if(fields[0].equals(name)){
                cCs.get(counter).AddcitNum();
            }
            else if(!fields[0].equals(name)){
                cCs.add(new CountryCityStuff((fields[0]),1, 0 ));
                name = fields[0];
                counter++;
            }

        }
    }

    /** Method to look through the stuff.csv folder and add to the records of the arraylist*/
    public static void findStuff(){
        String[] field;
        String line2;
        while(((line2 = stuff.fileReadLine()) != null)){
            field = line2.split(",");
            // for loop used due to nothing else being able to make the if .equals work otherwise
            for (int i = 0; i < cCs.size(); i++) {
                if (field[0].equals(cCs.get(i).getName())) {
                    cCs.get(i).AddstuffNum();
                }
            }
        }
        // Mainly adds the fist stuff num since it seems to skip the first entry and not add
        cCs.get(0).AddstuffNum();
    }

    /** Method to printf the asked output*/
    public static void printFormat(){

        System.out.format("%1s %20s %6s\n", "Country", "Cities", "Stuff");
        System.out.format("%1s %20s %6s\n", "=======", "======", "=====");
        for (CountryCityStuff cs: cCs ) {
            System.out.printf("%-20s  %4d %6d\n",cs.getName(), cs.getCitNum(), cs.getStuffNum());
        }
    }
}
