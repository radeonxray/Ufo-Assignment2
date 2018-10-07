package model.lockType;

import java.io.Serializable;
import interfaces.LockTypeInterface;

public class Locked implements LockTypeInterface, Serializable{

    String unlockCode;
    boolean isLocked;

    public Locked(String unlockCode, boolean isLocked) {
        
        this.unlockCode = unlockCode;
        this.isLocked = isLocked;
    
    }

    @Override
    public boolean isLocked() {
        
        return isLocked;
    
    }

    @Override
    public void unlock() {
        
        isLocked = false;
    
    }

    @Override
    public String getCode() {
        
        return unlockCode;
        
    }

}
