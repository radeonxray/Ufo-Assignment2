package model;

import interfaces.ItemInterface;
import java.io.Serializable;

public class Item implements Serializable{
    
    private String name, roomText, inspectText;
    private int value;
    private ItemInterface itemInterface;
    /**
         * Constructor for the item class. 
         * @param name Name for the item.
         * @param roomText Desctiption of where the item is in the room.
         * @param inspectText Description of the item when picked up. 
         * @param value Gold value of the item. 
         * @param itemType Determines what kind of item it is, if it is an consumable, an equipment, a key, and so on.
         */
    public Item(String name, String roomText, String inspectText, int value, ItemInterface itemType) {
        this.name = name;
        this.roomText = roomText;
        this.inspectText = inspectText;
        this.value = value;
        this.itemInterface = itemType;
    }

    public String getName() {
        return name;
    }

    public String getRoomText() {
        return roomText;
    }

    public String getInspectText() {
        return inspectText;
    }

    public int getValue() {
        return value;
    }

    public ItemInterface getItemInterface() {
        return itemInterface;
    }

}