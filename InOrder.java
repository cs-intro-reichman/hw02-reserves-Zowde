public class InOrder {
 
    public static void main(String[] args)
    {
    int maxnum=(int)(Math.random()*10);
    int num=maxnum;
    while(num>=maxnum)
    {
        System.out.print(num+" ");
        maxnum=num;
       num=(int)(Math.random()*10);
    }
}
}
