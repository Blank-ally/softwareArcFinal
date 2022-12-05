package first_edit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomFactoryMethodTest {

    @Test
    void FactoryTest(){
        RoomFactoryMethod room = new RoomFactoryMethod();
        String name = "Blankroom";
        Assertions.assertEquals( new StartRoom(name),room.makeRoom("startroom",name));
    }

}