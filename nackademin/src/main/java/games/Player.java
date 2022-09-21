package games;

public class Player {

    int score;
    String name;

    //constructor
    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    public void rageQiut(){
       System.exit(0);
    }

}
