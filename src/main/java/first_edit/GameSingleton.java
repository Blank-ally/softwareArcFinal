package first_edit;


public class GameSingleton {
    private player Player;
    private room currentRoom;
    private static GameSingleton gamesingle_instance = null;

    private boolean isFinshed = false;
    private GameSingleton() {

        Player = new player();
            RoomFactoryMethod roomfactory = new RoomFactoryMethod();
            currentRoom = roomfactory.makeRoom("startroom", "Whiteroom");
            room zeldaRoom = roomfactory.makeRoom("room 2", "zeldaRoom");
            room undertaleRoom = roomfactory.makeRoom("room 1", "undertaleRoom");
            room animalCrossingRoom = roomfactory.makeRoom("exitroom", "animalCrossingRoom");


            currentRoom.setUp(zeldaRoom);
            zeldaRoom.setEast(undertaleRoom);
            zeldaRoom.setDown(currentRoom);
            undertaleRoom.setWest(zeldaRoom);
            undertaleRoom.setNorth(animalCrossingRoom);
            animalCrossingRoom.setSouth(undertaleRoom);

        }

        public String ExitCurrentRoom ( char input){
            return currentRoom.performAction(Player, input);
        }
        public String GetcurrentRoomDescription () {
            return currentRoom.GetDescription();

        }
        public String GetCurrentRoomExits () {
            return currentRoom.GetExits();
        }
        public String GetPlayerInventory () {
            return Player.GetInventory();

        }
        public int GetPlayerScore () {
            return Player.GetScore();
        }

        public String InteractWithCurrentRoom ( char input){
            return currentRoom.performAction(Player, input);
        }

        public String LootCurrentRoom ( char input){
            return currentRoom.performAction(Player, input);
        }
        public boolean isFinished () {

            return Player.isFinished();
        }
        public boolean move ( char c){
            if (currentRoom.IsValidDirection(c)) {
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


