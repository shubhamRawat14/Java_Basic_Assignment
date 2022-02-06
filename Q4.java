//Q4.Write a Java Program to reverse a string without using String inbuilt function.

import java.util.Scanner;
public class Q4 {
    public static String reverseString(String str) {
        String res="";
        for(int i=str.length() -1; i>=0;i--){
            res+=str.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.print("Compile by Shubham Singh Rawat \nEmployee ID: 1747\n ");
        Scanner s = null;
       try{
            s = new Scanner(System.in);
            System.out.print("\nEnter a String: ");
            String str= s.nextLine();
            System.out.println("\nReverse String: "+reverseString(str));
       }
       finally{
            if(s!=null){
                s.close();
            }
            
       }
    }
}
