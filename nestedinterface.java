//nested interface
import java.util.*;
interface out{
    void outm();
    interface in{
        void innm();
    }
}
class main implements out.in{
    public void inm()
    {
        System.out.println("hello i'm inner method");
    }
    public static void main(String args[])
    {
        main h=new main();
        h.inm();
    }
    }
