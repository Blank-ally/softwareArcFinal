package first_edit;

public class UndertaleRoom extends Room {


    public UndertaleRoom(String name) {
        super(name,new Interact());

    }



    @Override
    public String getDescription() {
        return " you are filled with a sense of determination as you enter ";
    }
}
