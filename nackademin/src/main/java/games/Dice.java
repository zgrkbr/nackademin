package games;

import java.util.Random;

public class Dice {

    public int numOfSides;

    //constructor, anropas med keyword new
    public Dice(int numOfSides){
        this.numOfSides = numOfSides;
    }

    public int roll(){
        //I want an integer between 1 and 6!
        Random diceRandom = new Random();
        int result = diceRandom.nextInt(numOfSides)+1;
        return result;
    }

}
