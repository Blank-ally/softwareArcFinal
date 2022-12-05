package first_edit;

import java.util.ArrayList;

/*
[x]Player: A concrete class that contains an int field called score. It also contains a List of Strings called inventory. The Player class contains the following methods.
[x]A method named addToInventory that accepts a String argument and adds it to the Player's inventory list.
[x]A method named addToScore that accepts an int argument and adds it to the Player's score.
[x]A method named getInventory that returns a String. The String should contain the contents of the Player's inventory list. If the inventory is empty, return a message that says so.
[x]A method named getScore that return's the Player's score field (an int).*/
public class Player {

    int score;
    ArrayList<String> Inventory = new ArrayList<String>();
    boolean isFinished = false;

    public void addToInventory(String inven) {
        Inventory.add(inven);

    }

    public void addToScore(int newscore) {
        score += newscore;

    }

    public String getInventory() {
        if (Inventory.size() == 0 )
        return "Your inventory is currently empty ";
        else

            return String.join(", ",Inventory);
    }

    public int getScore() {
        return score;
    }

    public Boolean isFinished(){
        return this.isFinished;
    }
    public void setIsFinished(){
        this.isFinished = true;
    }
}
