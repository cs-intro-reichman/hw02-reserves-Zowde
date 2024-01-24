public class DamkaBoard {
public static void main (String[] args)
{
    int n=Integer.parseInt(args[0]);
    int sum=1;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i%2==0)
            {
             System.out.print("*");
            }
            else
            {
                if(sum==0)
                {
                   
               System.out.print(" ");
              sum++;
                }
              System.out.print("*");
            }
        }
        System.out.println();
        sum=0;
    }
}
}
