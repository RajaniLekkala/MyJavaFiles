package Lab1;


import java.util.Random;

public class Die {
    private int noOfSides;
    private int currentValue;
    public int getNoOfSides(){
        return noOfSides;
    }
    public int getCurrentValue(){
        return currentValue;
    }
    public Die(){
        noOfSides = 6;
    }
    public void roll(){
        Random randomGenerator  = new Random();
        currentValue = randomGenerator.nextInt(noOfSides) + 1;

       // System.out.println("Random value: " + currentValue);
    }

}
