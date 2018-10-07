package interfaces;

import java.util.ArrayList;
import model.Item;

public interface PlayerInterface {
    
    public void levelUp();
    
    public String getStats();
    
    public int calculateHighscore();
    
    public String useItem(String itemName);
   
    public void heal(int amount);
       
    public void calculateStats();
    
    public String getName();
    
    public int getHp();
    
    public int getDamage();
    
    public int getLevel();
    
    public int getArmor();
    
    public String getInventory();
    
    public ArrayList<Item> getEquipment();
    
    public String equippedItems();
    
    public String equipItem(String itemName);
    
    public boolean hasKey(String roomName);

}
