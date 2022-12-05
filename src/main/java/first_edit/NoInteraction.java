package first_edit;

public class NoInteraction implements ActionableStrategy {

    @Override
    public String action(Player player, char input) {
        return "no interaction available ";
    }
}
