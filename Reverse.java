public class Reverse {
    public static void main(String[] args)
    {
       String word=args[0];
       int length,i,index;
       char middle;
       length=word.length();
       if(length==1)//if the word comprise from 1 character
       {
           middle=word.charAt(0);
       }
       else{// finding the middle character
           index=length/2;
           if(length%2==0)
           {
            middle=word.charAt(index-1);
           }
           else
           {

            middle=word.charAt(index);

            }

       }
       i=length-1;//goes from backward
       while(i>=0)
       {
        System.out.print(word.charAt(i));;
        i--;
       }
       System.out.println();;
       System.out.print("The middle character is"+" "+middle);

    }
}
