public class PersonalAcct extends Account {

    private double balance = 100;
    private double amt = 0;

    public double deposit(double a){

        amt+=a;
        
        if(amt < balance){ 
            
            amt -=2;
            System.out.println("Deposit amount:" + amt);
        }
        return balance;
    } 

}
