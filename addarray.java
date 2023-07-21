import java.util.*;
public class addarray{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr[][]=new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int brr[][]=new int[r2][c2];
        int crr[][]=new int[r2][c2];
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                brr[i][j]=sc.nextInt();
            }
        }
        if((r1==r2) && (c1==c2))
        {
            for(int i=0;i<r1;i++)
            {
            for(int j=0;j<c1;j++)
            {
                crr[i][j]=arr[i][j]+brr[i][j];
            }
            }
       for(int i=0;i<r1;i++)
        {
            System.out.print("\n");
            for(int j=0;j<c1;j++)
            {
                System.out.println(" "+crr[i][j]);
            }
        }
        }
    }
}