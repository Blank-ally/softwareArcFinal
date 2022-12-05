package first_edit;

public class StartRoom extends Room {



    public StartRoom(String name) {
        super(name,new NoInteraction());
    }

    @Override
    public String getDescription() {
        return "You are surrounded by blank white walls ";
    }
}
