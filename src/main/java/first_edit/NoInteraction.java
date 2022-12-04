package first_edit;

public class NoInteraction implements ActionableStrategy {

    @Override
    public String action(player player, char input) {
        return "no interaction available ";
    }
}
