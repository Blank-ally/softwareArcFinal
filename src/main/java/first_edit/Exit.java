package first_edit;

public class Exit implements ActionableStrategy{
    @Override
    public String action(Player player, char input ) {
        if(Character.toUpperCase(input) == 'X') {
            player.addToScore(100);
            player.addToInventory("trophy");
            player.setIsFinished();
            return "you made it to the end woooow i didnt like that ";
        }else
            return "Invalid input" ;
    }

}
