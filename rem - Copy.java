import java.util.*;
public class rem{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=1;

    for(int i=1;i<=n;i++)
       {
           ans*=i;
       }
   System.out.println(ans);
           int rem,digit=0;


        while(ans!=0)
        {
            rem=ans%10;
            digit=digit*10+rem;
            ans=ans/10;

        }
        for(;digit>0;digit=digit/10)
        {
            rem=digit%10;
                        System.out.print(" "+rem);

        }
    }

}