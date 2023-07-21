import java.util.*;
public class lower{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            System.out.print("\n");
            for(int j=0;j<c;j++)
            {
                  if(i+j>1)
                  System.out.print(" "+arr[i][j]);
                  else
                  System.out.print(" ");
                
            }
        }

    }
}