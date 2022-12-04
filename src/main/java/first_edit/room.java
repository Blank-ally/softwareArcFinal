package first_edit;

/*
Room: An abstract class that contains a String field called name and six Room fields called north, south, east, west, up, and down. The Room class contains the following methods.
[x]A constructor that accepts a String for the name of the Room.
[x]An abstract method named getDescription that returns a String. The String will be displayed to the Player when they enter the Room and should contain a description of what they see.
[x]A method named getAdjoiningRoom that accepts a char argument for the direction. If this Room is connected to another Room in the given direction, that Room is returned. Otherwise, return null.
[x]A method named getExits that returns a String. The String should be a list of all of the directions the Player could move from this Room to another Room.
[x]A method named getName that returns the name of the Room.
[-]A method named isValidDirection that accepts a char argument for the direction. If this Room is connected to another Room in the given direction, return true. Otherwise, return false.
[x]Six setter methods -- one for each direction -- that accept a Room object and assign it to the appropriate field.
*/
public abstract class room {
    String name;
    room north;
    room south;
    room east;
    room west;
    room up;
    room down;
    ActionableStrategy action;

    public room(String name, ActionableStrategy action) {
        this.name = name;
        this.action = action;

    }
    public String performAction(player player, char input){
       return action.action(player,input);
    }
    public void setEast(room east) {
        this.east = east;
    }

    public void setSouth(room south) {
        this.south = south;
    }


    public void setUp(room up) {
        this.up = up;
    }

    public void setWest(room west) {
        this.west = west;
    }

    public void setDown(room down) {
        this.down = down;
    }

    public room GetAdjoiningRoom(char roomCode) {
        switch (roomCode) {
            case 'n':
                return north;
            case 'e':
                return east;
            case 'w':
                return west;
            case 's':
                return south;
            case 'u':
                return up;
            case 'd':
                return down;
            default:
                return null;
        }
    }

    public void setNorth(room north) {
        this.north = north;
    }

    public abstract String GetDescription();

    public String GetExits() {
        String OpenDirection = "";
        if (north != null)
            OpenDirection += "North ";
        if (south != null)
            OpenDirection += "South ";
        if (east != null)
            OpenDirection += "East ";
        if (west != null)
            OpenDirection += "West ";
        if (up != null)
            OpenDirection += "Up ";
        if (down != null)
            OpenDirection += "Down ";
        return OpenDirection;
    }

    public String GetName() {
        return name;
    }

    public boolean IsValidDirection(char c) {
        if (GetAdjoiningRoom(c) != null)
            return true;
        else return false;
    }


}
