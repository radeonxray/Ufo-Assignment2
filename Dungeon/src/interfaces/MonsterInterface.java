package interfaces;

import java.util.ArrayList;
import model.Item;

public interface MonsterInterface {
    
    public int getHp();
    
    public void setHp(int hp);
    
    public int getDamage();
    
    public int getLevel();
    
    public String getTaunt();
    
    public ArrayList<Item> getInventory();
    
}
