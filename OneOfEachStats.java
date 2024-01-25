import java.util.Random;
public class OneOfEachStats1 {
    public static void main(String[] args)
    {
        /*
     * boy=1
     * girl=0
     */
        int T=Integer.parseInt(args[0]);//Couples number
        int seed = Integer.parseInt(args[1]);
        Random generator = new Random(seed);  
        double children=0;
        int girlsnumber=0,boysnumber=0,boyorgirl=0;
        int childrenrange=0,c2=0,c3=0,c4=0;//
        for(int i=0;i<T;i++)//each iteration is couple
        {
           while(boysnumber==0||girlsnumber==0)//stoping if they have at least boy and girl
           {
                  boyorgirl=(int)(generator.nextDouble()*2);
                  if(boyorgirl==0)
                  {
                       girlsnumber++;
                  }
                  else
                  {
                    boysnumber++;
                  }
                  children++;//accumulate the children for the avg
                  childrenrange++;//  children per couple
           }
           //initialize children number and the childrenrange
           if(childrenrange==2)
           {
             c2++;
           }
           if(childrenrange==3)
           {
             c3++;
           }
           if(childrenrange>=4)
           {
             c4++;
           }
           childrenrange=0;
           girlsnumber=0;
           boysnumber=0;
        }
        double avg=(children/T);//The average number of children per family
        int mostcommon;
        if((avg-(int)(avg))>=0.5)
        {
         mostcommon=(int)avg+1;//common number of children
        }
        else
        {
            mostcommon=(int)avg;
        }
        System.out.println("Average:"+" "+avg+" "+"children to get at least one of each gender.");
        System.out.println("Number of families with 2 children:"+" "+c2);
        System.out.println("Number of families with 3 children:"+" "+c3);
        System.out.println("Number of families with 4 or more children:"+" "+c4);
        System.out.println("The most common number of children is"+" "+mostcommon+".");
        /* 
        Average: 2.7 children to get at least one of each gender.
        Number of families with 2 children: 5
        Number of families with 3 children: 3
        Number of families with 4 or more children: 2
        The most common number of children is 2.
        

        Average: 2.99 children to get at least one of each gender.
        Number of families with 2 children: 51
        Number of families with 3 children: 24
        Number of families with 4 or more children: 25
        The most common number of children is 2.
       */
    }

}
