package model.itemType;

import interfaces.ItemInterface;
import java.io.Serializable;

public class Consumable implements ItemInterface, Serializable {

    private int healthModifier;
    private boolean isConsumable, isMaximumHealing;

    public Consumable(int healthModifier, boolean isConsumable, boolean isMaximumHealing) {
        this.healthModifier = healthModifier;
        this.isConsumable = isConsumable;
        this.isMaximumHealing = isMaximumHealing;
    }

    public int getHealthModifier() {

        if (isMaximumHealing) {

            return 1337;

        } else {

            return healthModifier;

        }

    }

    @Override
    public boolean isAWeapon() {

        return false;

    }

    @Override
    public boolean isConsumable() {
        
        return true;
  
    }

    @Override
    public boolean isEquippable() {
        
        return false;
   
    }

    @Override
    public boolean isArmor() {
        
        return false;
   
    }

    @Override
    public boolean isKey() {
        
        return false;
  
    }

    @Override
    public int getDamageModifier() {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public int getArmorRating() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public String getKeyId() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    }

    @Override
    public void setKeyId(String roomName) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

}
