package model;

import interfaces.ItemInterface;
import interfaces.MonsterInterface;
import java.io.Serializable;
import java.util.ArrayList;
import interfaces.LockTypeInterface;

/**
 * Room class
 */
public class Room implements Serializable {

    //Initializing and instanciating variables. 
    private String roomName, description;
    private ArrayList<Item> items = new ArrayList();
    private Monster monster;
    private Chest chest;
    private LockTypeInterface lockTypeInterface;

    public Room north, south, west, east;

    /**
     * Constructor for the Room class.
     *
     * @param roomname The rooms name.
     * @param description The description of the room.
     * @param roomTypeInterface What kind of room it is.
     */
    public Room(String roomname, String description, LockTypeInterface roomTypeInterface) {

        this.roomName = roomname;
        this.description = description;
        this.north = null;
        this.south = null;
        this.west = null;
        this.east = null;
        this.lockTypeInterface = roomTypeInterface;

    }

    public void addRoomItem(String name, String roomText, String inspectText, int value, ItemInterface itemType) {

        items.add(new Item(name, roomText, inspectText, value, itemType));

    }

    public void addChest(String locationDescription, boolean isEndGameChest, LockTypeInterface lockTypeInterface) {

        chest = new Chest(locationDescription, isEndGameChest, lockTypeInterface);

    }

    public void addItemToChest(String name, String roomText, String inspectText, int value, ItemInterface itemType) {

        chest.addItem(name, roomText, inspectText, value, itemType);

    }

    public void addMonster(String name, String description, int id, MonsterInterface monsterType) {

        monster = new Monster(name, description, id, monsterType);

    }

    public void addItemToMonster(String name, String roomText, String inspectText, int value, ItemInterface itemType) {

        monster.addItem(name, roomText, inspectText, value, itemType);

    }

    /**
     * Method used to look up room items.
     * @param itemLookupText The text from the textGenerator.
     * @return Returns a string with available items.
     */
    public String itemLookup(String itemLookupText) {

        if (items == null) {

            return "";

        }

        String returnString = "";

        if (!items.isEmpty()) {
            returnString = itemLookupText;

            if (items.size() == 1) {

                returnString += "" + items.get(0).getRoomText() + ".\n";

            } else {

                for (int i = 0; i < items.size(); i++) {

                    returnString += "" + items.get(i).getRoomText();

                    if (i != items.size() - 1) {

                        returnString += " and ";

                    } else if (i == items.size() - 1) {

                        returnString += ".\n";

                    }

                }

            }

        }

        return returnString;

    }

    /**
     * Method used to look up chest.
     * @param itemLookupText The text from the textGenerator. 
     * @return Returns a string with available items.
     */
    public String chestLookup(String itemLookupText) {

        if (chest == null) {

            return "";

        }

        String returnString = itemLookupText;

        returnString += chest.getLocationDescription() + ".\n";

        return returnString;

    }

    public void dropMonsterItems() {
        
        if (!monster.getInventory().isEmpty()){
            
            items.addAll(monster.getInventory());
            monster.setInventory(null);
            
        }   
        

    }

    @Override
    public String toString() {

        return description;

    }

    public String getDescription() {

        return description;

    }

    public ArrayList<Item> getItems() {

        return items;

    }

    public void setItems(ArrayList<Item> items) {

        this.items = items;

    }

    public String getRoomName() {

        return roomName;

    }

    public Monster getMonster() {

        return monster;

    }

    public LockTypeInterface getLockTypeInterface() {

        return lockTypeInterface;

    }

    public Chest getChest() {

        return chest;

    }

    public void setChest(Chest chest) {

        this.chest = chest;

    }

}
