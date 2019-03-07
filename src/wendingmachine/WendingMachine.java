/*
 * Ramya Krishna Gajula
 * Student ID: 99
 * Syst 
 */
package wendingmachine;

import java.util.Scanner;

/**
 * A class that models vending machine items.
 * Items have a name and a price. The possible items are listed in the
 * array called Candies. Use this code to answer questions
 * B.1 and B.2 in the midterm review.
 * @author Ramya Gajula 2019
 */
public class WendingMachine 
{
    private double price;
    private static String [] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public WendingMachine()
    {
        //intentionally left blank
    }
    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the candies
     */
    public static String[] getCandies() {
        return candies;
    }

    /**
     * @param aCandies the candies to set
     */
    public static void setCandies(String[] aCandies) {
        candies = aCandies;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the vendin machine, here is a list of the possible candies");
        for(int i=0; i<getCandies().length; i++)
        {
            System.out.println(getCandies()[i]);
        }
        System.out.println("To re-fill the vending machine, please follow instructions in program 2");
        //there is no program 2 because we haven't created an approprite design for this code yet!
    }
    
}
