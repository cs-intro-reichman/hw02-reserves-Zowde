public class Perfect {
    public static void main(String[] args)
    {
       int num=Integer.parseInt(args[0]);
       int sum=0;
       String divi=" ",divi2;
       for(int i=1;i<num;i++)
       {
        if(num%i==0)
        {
            if(sum==0)
            {
                divi+=i+" ";
            }
            else
               {
                divi2="+"+" "+i+" ";
                divi+=divi2;
               }
            
         sum+=i;
         
        }
    
       } 
    if(num==sum)
    {
        System.out.print(num+" "+"is a perfect number since"+" "+num+" "+"="+divi);
    }
}
}
