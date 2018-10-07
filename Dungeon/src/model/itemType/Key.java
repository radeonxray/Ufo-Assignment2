package model.itemType;

import interfaces.ItemInterface;
import java.io.Serializable;

public class Key implements ItemInterface, Serializable {

    private boolean isQuestItem;
    private String keyId;

    public Key(boolean isQuestItem, String keyId) {

        this.isQuestItem = isQuestItem;
        this.keyId = keyId;

    }

    @Override
    public boolean isAWeapon() {
        
        return false;
    
    }

    @Override
    public boolean isConsumable() {
        
        return false;
    
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
        
        return true;
   
    }

    @Override
    public String getKeyId() {
        
        return keyId;
   
    }

    @Override
    public void setKeyId(String roomId) {
        
        keyId = roomId;
  
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
    public int getHealthModifier() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    }

}
