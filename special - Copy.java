import java.util.*;
public class special{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++)
        {
            if(!Character.isLetterOrDigit(ch[i]) && !Character.isWhitespace(ch[i]))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}