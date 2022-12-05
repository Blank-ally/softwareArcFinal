package first_edit;

public class RoomFactoryMethod  {

    public Room makeRoom(String room, String name) {

        if (room == null || room.isEmpty())
            return null;
        switch (room){
            case"startroom":
                return new StartRoom(name);
            case"room 1":
                return new UndertaleRoom(name);
            case "room 2":
                return new ZeldaRoom(name);
            case"exitroom":
                return new AnimalCrossingRoom(name);

            default:
                throw new IllegalArgumentException("Unknown room" + room);


        }


    }


}
