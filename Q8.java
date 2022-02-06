//Q8.Write a program to print your Firstname, LastName & age using static block, static method & static variable respectively
public class Q8 {
    static String Firstname, LastName;
    static int age;
    static void displayDetails(){
        System.out.println("Static method");
        System.out.println("\nFirstname: "+Firstname +"\nLastname: "+LastName+"\nAge: "+age);
    }
    static{
        Firstname="Shubham";
        LastName="Rawat";
        age=23;
        System.out.println("Static block");
        displayDetails();
    }
    public static void main(String[] args) {
        System.out.print("\nCompile by Shubham Singh Rawat \nEmployee ID: 1747\n ");
    }
}
