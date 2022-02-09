/*
Q16. WAP to show object cloning in java using cloneable and copy constructor both
*/
public class Q16 implements Cloneable{
  
String name;  
  
Q16(String name){    
this.name=name;  
}  

//copy constructor
Q16(Q16 q){
    name = q.name;
}
void changeName(String str){
    this.name =str;
}
  
public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  
   public static void main(String[] args) {
    System.out.print("\nCompile by Shubham Singh Rawat \nEmployee ID: 1747\n");
    try{  
        
        Q16 s1=new Q16("amit");  
        
        Q16 s2=(Q16)s1.clone();  
        
        System.out.println("\n Using Clone() \n Before change"); 

        System.out.println(s1.name);  
        System.out.println(s2.name);  

        s2.changeName("Akash");
        
        System.out.println("\n After change");  
         

        
        System.out.println(s1.name);  
        System.out.println(s2.name);    
        System.out.println("\n Using Copy Constructor \n Before change"); 
        
        Q16 s3 = new Q16(s1);
        System.out.println(s1.name);  
        System.out.println(s3.name);  

        s3.changeName("Jack");
        
        System.out.println("\n After change");  
         

        
        System.out.println(s1.name);  
        System.out.println(s3.name);


        }catch(CloneNotSupportedException c){}  
          
        }  
   } 

