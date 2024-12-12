// serializable marker interface
import java.util.*;
interface printable{
}
class h implements printable{
    public void print()
    {
        System.out.println("hello students");
    }
}
public class main{
    public static void main(String args[])
    {
        h f=new h();
        f.print();
    }
}
    