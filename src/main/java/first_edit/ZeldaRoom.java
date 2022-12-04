package first_edit;

public class ZeldaRoom extends room  {


    public ZeldaRoom(String name) {
        super(name, new Loot());

    }

    @Override
    public String GetDescription() {
        return "The Grassy fields of Hyrule provide a warm an inviting air";
    }




    }

