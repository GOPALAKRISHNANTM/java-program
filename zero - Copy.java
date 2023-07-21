import java.util.*;
public class zero{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
        long ans=1;

    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
{
    ans*=i;
}
   System.out.println(ans);
 
}

}