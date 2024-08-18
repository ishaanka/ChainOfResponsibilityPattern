package Impl;

import Interface.IObj;

public class Obj1 extends IObj {
    public Obj1(IObj next) {
        this.nextObject = next;
    }

    @Override
    public void processRequest(String val) {
        if(val.equals("1"))
            System.out.println("Processed from OBJ : "+ val);
        else
            super.processRequest(val);
    }
}
