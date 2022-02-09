//Q17. WAP showing try, multi-catch and finally blocks.
public class Q17 {
    public static void main(String[] args) {
        System.out.print("\nCompile by Shubham Singh Rawat \nEmployee ID: 1747\n");
        try{    
            int a[]=new int[5];    
            a[5]=13/0;    
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }          
            finally{
                System.out.println("This is finally Block");
            }   
               
    }  
}

