package us.JohnErickson;
/**
 *   Unit One Project - CountryCityStuff.java
 *   Custom Arraylist file
 *
 *   @author John Erickson
 *   @version .0623
 */

public class CountryCityStuff {
    private String name;
    private int citNum;
    private int stuffNum;
    /**Main Constructor for the Array list*/
    public CountryCityStuff(String name, int c, int s){
        this.name = name;
        this.citNum = c;
        this.stuffNum = s;
    }
    /**Method to Add one for each call to citNum*/
    public void AddcitNum(){
        this.citNum++;
    }
    /**Method to Add one for each call to stuffNum*/
    public void AddstuffNum(){
        this.stuffNum++;
    }
    /**Getter for name*/
    public String getName() {
        return name;
    }
    /**Getter for citNum*/
    public int getCitNum() {
        return citNum;
    }
    /**Getter for stuffNum*/
    public int getStuffNum() {
        return stuffNum;
    }

}
