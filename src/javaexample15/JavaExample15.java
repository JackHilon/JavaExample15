
package javaexample15;

import java.util.Scanner;


public class JavaExample15 {

    
    public static void main(String[] args) {
        
        int a;
        double b1, b2;
        String str;
        
        try
        (Scanner in=new Scanner(System.in);){
            System.out.print("Enter an integer: ");
            a=in.nextInt();
            System.out.println("Your integer is# "+a);
            
            System.out.println("Give me two double numbers....");
            b1=in.nextDouble();
            b2=in.nextDouble();
            System.out.println("You doubles are# "+b1+" and# "+b2);
            
            in.nextLine(); // muste be here. Otherwise, str variable will take
                           // the enter button as a string
            
            System.out.print("Please enter a string: ");
            str=in.nextLine();
            System.out.println("Your string is -> "+str);
            
        }// end try
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
    }
    
}
