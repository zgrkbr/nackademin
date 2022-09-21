package games;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dice dice = new Dice(6);

        Player nadja = new Player("Nadja", 0);

        //1. anropa roll() och spara i en variabel
        int result = dice.roll();

        //en for-loop
        for (int i = 0; i < 3; i++) {
            //2. Spelaren skall gissa! MEN måste gissa inom rätt intervall: 1-6
            boolean guessIsOutOfBounds = true;
            int guess = 0;

            while(guessIsOutOfBounds) {
                System.out.print("Guess what the dice rolled :");
                guess = scanner.nextInt();
                if(guess >= 1 && guess <=6){
                    guessIsOutOfBounds = false;
                }
            }

            //3. Skriv ut resultatet
            System.out.println("You guessed " + guess + ".");

            //4. Skriv ut om spelaren gissade rätt eller fel

            if (result == guess) {
                System.out.println("The dice rolled " + result + ".\n" + "You Win!");
                break;
            } else {
                System.out.println("Wrong guess! You have " + (2-i) + " guesses left");
            }
        }//for

        System.out.println("toString()-metoden skriver ut minnesadressen ny default: " + dice.toString() +
                ".\nDet kan vi ändra genom annotationen @Override: polymorphism.");
    }
}
