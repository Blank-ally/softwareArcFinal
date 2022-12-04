package first_edit;

public class Interact implements ActionableStrategy{


    @Override
    public String action(player player, char input) {
        if(Character.toUpperCase(input) == 'I') {
            player.addToScore(20);
            player.AddToInventory("game pixel");
            return "you touched the walls and discover a game pixel ";
        }else
            return "Invalid input" ;
    }
}

