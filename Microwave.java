//---------------------------------------//
//-- Created by:     Alireza Teimoori  --//
//-- Created on:     Feb 9 2019        --//
//-- Created for:    Unit 1-04         --//
//-- Course Code:    ICS4U             --//
//-- Teacher Name:   Chris Atkinson    --//
//---------------------------------------//

// This program calculates the amount of time that is required for certain types of foods
// The code written in this program demonstrates the use of dictionaries (Map)

import java.util.*; // Import required packages:

public class Microwave{

    // Intro Variables:
    public static double itemCount;
    public static String item = "";
    public static double cooktime;
    public static Map<String, Double> foodMap = new HashMap<String, Double>();
    public static Map<Double, Double> timeMap = new HashMap<Double, Double>();

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        // Adding parameters to foodmap:
        foodMap.put("pizza", 0.75);
        foodMap.put("sub", 1.0);
        foodMap.put("soup", 1.75);

        // Adding parameters to foodmap:        
        timeMap.put(1.0,1.0);
        timeMap.put(2.0,1.5);
        timeMap.put(3.0,2.0);

        // Asking for and storing data:
        System.out.println("What food do you want?     (sub, pizza, soup) \n"); item = userInput.next();
        System.out.println("How many do you want?    (1, 2, 3) \n"); itemCount = userInput.nextInt();
        
        // Calculations:
        cooktime = foodMap.get(item) * timeMap.get(itemCount);
        
        // Output:
        System.out.println("OK, it will take " + cooktime + " minutes.");
        
        
        
    }
}