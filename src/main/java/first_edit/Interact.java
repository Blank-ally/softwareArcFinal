package first_edit;

public class Interact implements ActionableStrategy{


    @Override
    public String action(Player player, char input) {
        if(Character.toUpperCase(input) == 'I') {
            player.addToScore(20);
            player.addToInventory("game pixel");
            return "you touched the walls and discover a game pixel ";
        }else
            return "Invalid input" ;
    }
}

