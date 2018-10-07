package model.itemType;

import interfaces.ItemInterface;
import java.io.Serializable;

public class ArmorSet implements ItemInterface, Serializable {

    private int healthMultiplier;
    private int armorRating;

    public ArmorSet(int healthMultiplier, int armorMultiplier) {

        this.healthMultiplier = healthMultiplier;
        this.armorRating = armorMultiplier;

    }

    public double getHealthMultiplier() {

        return healthMultiplier;

    }

    public double getArmorMultiplier() {

        return armorRating;

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
    public int getHealthModifier() {

        return healthMultiplier;

    }

    @Override
    public boolean isEquippable() {

        return true;

    }

    @Override
    public boolean isArmor() {

        return true;

    }

    @Override
    public int getArmorRating() {

        return armorRating;

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
    public String getKeyId() {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void setKeyId(String roomName) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

}
