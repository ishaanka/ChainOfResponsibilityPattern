package Interface;

public class IObj {
    public IObj nextObject;
    public void processRequest(String val) {
        nextObject.processRequest(val);
    }
}
