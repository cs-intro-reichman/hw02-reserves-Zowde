public class Divisors{

    public static void main(String[] args)
    {
        int num=Integer.parseInt(args[0]);
        for(int divisor=1;divisor<=num;divisor++)
        {
             if(num%divisor==0)
             {
                System.out.println(divisor);
             }
        }
    }
}
