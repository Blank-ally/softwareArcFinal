package first_edit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActionableStrategyTest {
    ActionableStrategy loot = new Loot();
    ActionableStrategy interaact = new Interact();
    ActionableStrategy exit = new Exit();

player Player = new player();
   @Test
   void LootPositiveTest(){
       Assertions.assertEquals("you hit the jackpot you got a gold coin",loot.action(Player,'l'));
   }
    @Test
    void LootnegativeTest(){
        Assertions.assertEquals("Invalid input",loot.action(Player,'t'));

    }

    @Test
    void InteractPositiveTest(){
        Assertions.assertEquals("you touched the walls and discover a game pixel ",interaact.action(Player,'i'));
    }
    @Test
    void InteraactnegativeTest(){
        Assertions.assertEquals("Invalid input",interaact.action(Player,'t'));
    }
    @Test
    void exitPositiveTest(){
        Assertions.assertEquals("you made it to the end woooow i didnt like that ",exit.action(Player,'x'));
    }
    @Test
    void exitnegativeTest(){
        Assertions.assertEquals("Invalid input",exit.action(Player,'t'));
    }


}