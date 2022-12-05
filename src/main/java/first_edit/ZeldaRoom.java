package first_edit;

public class ZeldaRoom extends Room {


    public ZeldaRoom(String name) {
        super(name, new Loot());

    }

    @Override
    public String getDescription() {
        return "The Grassy fields of Hyrule provide a warm an inviting air";
    }




    }

