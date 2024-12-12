import java.util.*;
public class arraylist2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //accepting  array list elements
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int s=sc.nextInt();
            a.add(s);
        }
        //printing the elements in a array list
        for(int i=0;i<a.size();i++)
        System.out.print(a.get(i)+" ");
    }
}
