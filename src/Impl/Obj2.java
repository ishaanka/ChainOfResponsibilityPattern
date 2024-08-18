package Impl;

import Interface.IObj;

public class Obj2 extends IObj {
    public Obj2(IObj next) {
        this.nextObject = next;
    }

    @Override
    public void processRequest(String val) {
        if(val.equals("2"))
            System.out.println("Processed from OBJ : "+ val);
        else
            super.processRequest(val);
    }
}
