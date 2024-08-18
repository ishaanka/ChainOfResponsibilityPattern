import Impl.Obj1;
import Impl.Obj2;
import Impl.Obj3;
import Interface.IObj;

public class Main {
    public static void main(String[] args) {
        IObj check1 = new Obj1(new Obj2(new Obj3(null)));
        check1.processRequest("1");
        check1.processRequest("2");
        check1.processRequest("3");
    }
}