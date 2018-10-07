package interfaces;

import java.util.ArrayList;
import model.Item;

public interface ChestInterface {

    public boolean isEndGameChest();

    public ArrayList<Item> getInventory();
    
}
