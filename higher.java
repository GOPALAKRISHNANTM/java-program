import java.util.*;

public class higher{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int f=0,s=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>f)
            {
                f=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
             if(arr[i]>s && arr[i]<f)
            {
                s=arr[i];
            }
        }
        int ans;
        ans=s+f;
        System.out.println(ans);
    }
}