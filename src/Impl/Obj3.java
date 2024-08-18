package Impl;

import Interface.IObj;

public class Obj3 extends IObj {
    public Obj3(IObj next) {
        this.nextObject = next;
    }

    @Override
    public void processRequest(String val) {
        if(val.equals("3"))
            System.out.println("Processed from OBJ : "+ val);
        else
            super.processRequest(val);
    }
}
