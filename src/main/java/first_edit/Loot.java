package first_edit;

public class Loot implements ActionableStrategy {



    @Override
    public String action(player player, char input) {
        if(Character.toLowerCase(input) == 'l') {
            player.addToScore(60);
            player.AddToInventory("gold coin");
            return "you hit the jackpot you got a gold coin";
        }else
            return "Invalid input" ;
    }
}
