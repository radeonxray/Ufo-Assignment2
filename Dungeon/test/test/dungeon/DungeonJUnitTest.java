package test.dungeon;

import java.util.ArrayList;
import model.Item;
import model.itemType.Key;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DungeonJUnitTest {
    
    private GameControlUsedForTestingOnly gc;
    
    public DungeonJUnitTest() {
    }
    
    @Before
    public void setUp() {
        
        gc = new GameControlUsedForTestingOnly("test");
        
    }
    
    /**
     * Checking if movement, and wall detection works. 
     */
    @Test
    public void checkMovement(){
        
        //Testing is wall detection works. 
        gc.move("south");
        assertTrue("Room south of Room1 is a wall, player should not move", gc.getCurrentRoom().getRoomName().equals("Entrance"));
        
        //Testing movement to another room.
        gc.move("north");
        assertTrue("Room north of Room1 should have been Corridor, but was not.", gc.getCurrentRoom().getRoomName().equals("Corridor"));
        
        //Testing locked rooms.
        gc.setCurrentRoom(gc.getRoom18());
        gc.move("west");
        assertTrue("Room west of room 18 is locked, should not have been able to enter room 19.", gc.getCurrentRoom().getRoomName().equals("Corridor"));
        
        //Testing unlocking functionalities.
        ArrayList<Item> testItems = new ArrayList();
        testItems.add(new Item("Altar of Anubis Key", " a strange silver key ", "An inscription on the key states: \"Key to the Altar of Anubis\"", 0, new Key(true, "Altar of Anubis Key")));
        gc.getPlayer().addItemToInventory(testItems);
        gc.unlockRoom();
        gc.move("west");
        assertTrue("Room west of room 18 is unlocked, should shave been able to enter room 19.", gc.getCurrentRoom().getRoomName().equals("Altar of Anubis"));
                
    }
    
    /**
     * Checking combat. 
     */
    @Test
    public void checkCombat(){
        
        //Check if "flee" works.
        gc.move("north");
        gc.combatSystem("flee");
        gc.getCurrentRoom().getRoomName().equals("Entrance");
        
        //Checking if player gets hit.
        gc.move("north");
        assertTrue("Health should be 28, it's not", gc.getPlayer().getHp() == 28);
        
        //Checking if heal potion works.
        gc.inputAnalyzer("use healing potion");
        assertTrue("Health should be 30, it's not", gc.getPlayer().getHp() == 30);
        
        //Checking if player can attack.
        gc.combatSystem("attack");
        assertTrue("Monster should be dead, it is not", gc.getCurrentRoom().getMonster().isIsAlive() == false);
        
        //Check if player can loot.
        gc.inputAnalyzer("pickup");
        assertTrue("Inventory should contain a rusty key, it does not: ", gc.getPlayer().getInventory().contains("Rusty key"));
                
    }
    
}
