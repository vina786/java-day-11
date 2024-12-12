import java.util.*; 
public class arraylist {
public static void main(String args[])
{
    ArrayList<Integer>a =new ArrayList<>();
    a.add(345);
    a.add(909);
    a.add(786);
    //modifying at particular index
    a.add(1,789);
    //modifying
    a.set(2,7878);
    System.out.println(a);
}
}
