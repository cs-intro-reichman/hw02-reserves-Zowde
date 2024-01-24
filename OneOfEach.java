public class OneOfEach {
    public static void main (String [] args)
    {
    /*
     * boy=1
     * girl=0
     */
   int chnumber=(int)(Math.random()*10);//number of children
     int girlsnumber=0,boysnumber=0,boyorgirl=0;

    for(int i=0;i<chnumber;i++)
    {
        
         boyorgirl=(int)(Math.random()*2);
         if(boyorgirl==0)
         {
            System.out.print('g'+" ");
            girlsnumber++;
         }
         else
         {
            System.out.print('b'+" ");
            boysnumber++;
         }
    }
    if(girlsnumber>0&&boysnumber>0)
    {
        System.out.print("You made it... and you now have"+" "+(girlsnumber+boysnumber)+" "+" children");
    }
    //int chnumber=(int)(Math.random()*2);
  
}
}
