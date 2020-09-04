import java.util.regex.*;

import java.util.Scanner;

public class OccurrenceOfChar{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word:");
        String sent = s.nextLine();

         if(!Pattern.matches("^[A-Za-z]+$",sent))

         {

             System.out.println("Not a valid string");

         }
         
         else
         {
             System.out.println("Enter the character:");
             char m = s.next().charAt(0);
        if( !((m >= 'a' && m <= 'z') || (m >= 'A' && m <= 'Z')))
        {
             System.out.println("Given character is not an alphabet");
            
        }
        else
        {
             int c = 0;
             int i;

        for (i = 0; i < sent.length(); i++)
           {
            if(sent.charAt(i)==m)
              c++;
           }
        if(c==0)
        {
            System.out.println("The given character '"+m+"' not present in the given word.");
        }
        else
        {
            System.out.println("No of '"+m+"' present in the given word is "+c+".");
        }

      }
             
         
    }
    
}
}

