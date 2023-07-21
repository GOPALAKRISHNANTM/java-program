import java.util.*;

public class monkey20
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("total no. of monkeys:");
        int n=sc.nextInt();
        System.out.println("no. of eatabale bananas:");
        int b=sc.nextInt();
        System.out.println("no. of eatabale peanuts:");
        int p=sc.nextInt();
        System.out.println("total no. of bananas:");
        int m=sc.nextInt();
        System.out.println("total no. of peanuts:");
        int l=sc.nextInt();
        if(b<0 && p<0)
        {
        int banana=m/b;
        int peanut=l/p;
        int k=banana+peanut;

        int ans=n-k;
        System.out.print(k);
        }
    
        else
        {
            System.out.print("invalid");
        }


        

    }
}