import java.util.*;
public class arraylist1 {
    public static void main(String args[])
    {
        //accepting array list elements
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int s=sc.nextInt();
            a.add(s);
        }
        a.add(89);
        System.out.println(a);
        }
    }
    

