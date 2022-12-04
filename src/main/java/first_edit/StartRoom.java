package first_edit;

public class StartRoom extends room {



    public StartRoom(String name) {
        super(name,new NoInteraction());
    }

    @Override
    public String GetDescription() {
        return "You are surrounded by blank white walls ";
    }
}
