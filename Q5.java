/*
Q5.First Factorial
Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it. For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24. For the test cases, the range will be between 1 and 18 and the input will always be an integer.Examples
Input: 4
Output: 24
Input: 8
Output: 40320
*/
import java.util.Scanner;
public class Q5 {

    public static long FirstFactorial(long num) {
        long res=1;
        while(num>1){
            res*=num;
            num--;
        }
        return res;
    }    
    public static void main(String[] args) {
        System.out.print("Compile by Shubham Singh Rawat \nEmployee ID: 1747\n ");
        Scanner s = null;
        long num;
        try {
            s= new Scanner(System.in);
            System.out.print("\nEnter a number to find its factorial: ");
            num = s.nextLong();
            System.out.print("\nFactorial of the given number [ "+num+"! ] is: "+FirstFactorial(num)+"\n");
        } finally{
            if(s!=null){
                s.close();
            }
        }
    }
}
