package first_edit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ActionableStrategyTest {
    ActionableStrategy loot = new Loot();
    ActionableStrategy interaact = new Interact();
    ActionableStrategy exit = new Exit();

first_edit.Player Player = new Player();
   @Test
   void lootPositiveTest(){
       Assertions.assertEquals("you hit the jackpot you got a gold coin",loot.action(Player,'l'));
   }
    @Test
    void lootNegativeTest(){
        Assertions.assertEquals("Invalid input",loot.action(Player,'t'));

    }

    @Test
    void interactPositiveTest(){
        Assertions.assertEquals("you touched the walls and discover a game pixel ",interaact.action(Player,'i'));
    }
    @Test
    void interactNegativeTest(){
        Assertions.assertEquals("Invalid input",interaact.action(Player,'t'));
    }
    @Test
    void exitPositiveTest(){
        Assertions.assertEquals("you made it to the end woooow i didnt like that ",exit.action(Player,'x'));
    }
    @Test
    void exitNegativeTest(){
        Assertions.assertEquals("Invalid input",exit.action(Player,'t'));
    }


}