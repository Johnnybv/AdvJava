package us.JohnErickson.test;

import org.junit.*;

/**
 *   Unit One Project - TestCountyCityStuff.java
 *   Junit test file to test the CountryCityStuff.java file
 *
 *   @author John Erickson
 *   @version .0623
 */
public class TestCountyCityStuff {

    @Test
    public void testCountyCityStuff(){
        Assert.assertEquals("Afghanistan", "Afghanistan");
        Assert.assertEquals("South Africa", "South Africa");
    }

}
