import java.util.*;

public class numerator{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int d=sc.nextInt();
        int ans=0;
        if(m>d)
        {
            ans=m*d+n;
            System.out.print(ans);
        }
        else
        {
System.out.print("Invalid input");
        }
        System.out.println("\n"+d);
    }
}