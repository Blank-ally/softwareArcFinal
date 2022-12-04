package first_edit;

public class AnimalCrossingRoom extends room  {
    public AnimalCrossingRoom(String name) {
        super(name,new Exit());
    }


    @Override
    public String GetDescription() {
        return "There is gentle sway of the palm trees as you are greeted by Tom Nook,Timmy,Tommy and isabelle welcoming you to the island ";
    }
}
