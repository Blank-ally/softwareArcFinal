package first_edit;


public class GameSingleton {
    private Player Player;
    private Room currentRoom;
    private static GameSingleton gamesingle_instance = null;

    // private boolean isFinshed = false;
    private GameSingleton() {

        Player = new Player();
        RoomFactoryMethod roomfactory = new RoomFactoryMethod();
        currentRoom = roomfactory.makeRoom("startroom", "Whiteroom");
        Room zeldaRoom = roomfactory.makeRoom("room 2", "zeldaRoom");
        Room undertaleRoom = roomfactory.makeRoom("room 1", "undertaleRoom");
        Room animalCrossingRoom = roomfactory.makeRoom("exitroom", "animalCrossingRoom");


        currentRoom.setUp(zeldaRoom);
        zeldaRoom.setEast(undertaleRoom);
        zeldaRoom.setDown(currentRoom);
        undertaleRoom.setWest(zeldaRoom);
        undertaleRoom.setNorth(animalCrossingRoom);
        animalCrossingRoom.setSouth(undertaleRoom);

    }

    public String exitCurrentRoom(char input) {
        return currentRoom.performAction(Player, input);
    }

    public String getcurrentRoomDescription() {
        return currentRoom.getDescription();

    }

    public String getCurrentRoomExits() {
        return currentRoom.getExits();
    }

    public String getPlayerInventory() {
        return Player.getInventory();

    }

    public int getPlayerScore() {
        return Player.getScore();
    }

    public String interactWithCurrentRoom(char input) {
        return currentRoom.performAction(Player, input);
    }

    public String lootCurrentRoom(char input) {
        return currentRoom.performAction(Player, input);
    }

    public boolean isFinished() {

        return Player.isFinished();
    }

    public boolean move(char c) {
        if (currentRoom.isValidDirection(c)) {
            switch (c) {
                case 'n':
                    currentRoom = currentRoom.north;
                    break;
                case 's':
                    currentRoom = currentRoom.south;
                    break;
                case 'w':
                    currentRoom = currentRoom.west;
                    break;
                case 'e':
                    currentRoom = currentRoom.east;
                    break;
                case 'u':
                    currentRoom = currentRoom.up;
                    break;
                case 'd':
                    currentRoom = currentRoom.down;
                    break;
            }

            return true;
        } else return false;
    }


    public static GameSingleton getInstance() {
        if (gamesingle_instance == null)
            gamesingle_instance = new GameSingleton();
        return gamesingle_instance;
    }

}


