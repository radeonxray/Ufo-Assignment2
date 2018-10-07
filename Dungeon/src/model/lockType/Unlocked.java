package model.lockType;

import java.io.Serializable;
import interfaces.LockTypeInterface;

public class Unlocked implements LockTypeInterface, Serializable{

    public Unlocked() {
    }

    @Override
    public boolean isLocked() {
        
        return false;
   
    }

    @Override
    public void unlock() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public String getCode() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }
    
    

 

    
}
