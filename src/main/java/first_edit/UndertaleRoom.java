package first_edit;

public class UndertaleRoom extends room {
    private ActionableStrategy action ;

    public UndertaleRoom(String name) {
        super(name,new Interact());
       ;
    }



    @Override
    public String GetDescription() {
        return " you are filled with a sense of determination as you enter ";
    }
}
