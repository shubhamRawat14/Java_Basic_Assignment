/*
Q9.Create 3 subclasses of bank SBI, BOI, ICICI all 4 should have a method called get details which provide 
there specific details like rate of interest etc, print details of every bank.
*/
public class Q9 {
    public static void main(String[] args) {
        System.out.print("\nCompile by Shubham Singh Rawat \nEmployee ID: 1747\n");
        bank b1 = new bank();
        b1.getDetails();

        SBI sbi1= new SBI();
        sbi1.getDetails();

        BOI boi1 = new BOI();
        boi1.getDetails();

        ICICI icici  = new ICICI();
        icici.getDetails();
    }
}
class bank{
    float rateOfInterest=2;
    float WidrawnLimitMonth=100000;
    void getDetails(){
        System.out.println("\n\nBank \nRate of Interest: "+rateOfInterest+"%\nWidrawn Limit per Month: "+WidrawnLimitMonth);
        
    }
}
class SBI extends bank{
    SBI(){
        rateOfInterest = 3;
        WidrawnLimitMonth = 50000;
    }
    void getDetails(){
        System.out.println("\n\nSBI \nRate of Interest: "+rateOfInterest+"%\nWidrawn Limit per Month: "+WidrawnLimitMonth);
    }
}
class BOI extends bank{
    BOI(){
        rateOfInterest = (float) 3.5;
        WidrawnLimitMonth = 45000;
    }
    void getDetails(){
        System.out.println("\n\nBOI \nRate of Interest: "+rateOfInterest+"%\nWidrawn Limit per Month: "+WidrawnLimitMonth);
    }
}
class ICICI extends bank{
    ICICI(){
        rateOfInterest = (float) 3.9;
        WidrawnLimitMonth = 75000;
    }
    void getDetails(){
        System.out.println("\n\nICIC \nRate of Interest: "+rateOfInterest+"%\nWidrawn Limit per Month: "+WidrawnLimitMonth);
    }
}