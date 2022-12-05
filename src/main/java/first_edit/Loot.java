package first_edit;

public class Loot implements ActionableStrategy {



    @Override
    public String action(Player player, char input) {
        if(Character.toLowerCase(input) == 'l') {
            player.addToScore(60);
            player.addToInventory("gold coin");
            return "you hit the jackpot you got a gold coin";
        }else
            return "Invalid input" ;
    }
}
