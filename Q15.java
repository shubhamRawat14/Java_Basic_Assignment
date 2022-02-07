//Q15. WAP to create a singleton class.
public class Q15 {
    public static void main(String[] args) {

        System.out.print("\nCompile by Shubham Singh Rawat \nEmployee ID: 1747\n");
        singleton a =singleton.getInstance();
        singleton b =singleton.getInstance();
        System.out.println("Hashcode of a: "+a.hashCode());
        System.out.println("Hashcode of b: "+b.hashCode());
    }
}

class singleton{
    private static singleton instance= null;
    public String str;
    private singleton(){
        str="Singleton Class";
    }
    public static singleton getInstance(){
        if (instance==null)
            instance = new singleton();
        return instance;
    }
}
