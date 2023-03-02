import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        PersonalAcct perAcct = new PersonalAcct();
        BusinessAcct bAcct = new BusinessAcct();

        Scanner scan = new Scanner(System.in);
        double personalDeposit;
        double businessDeposit;

        System.out.println("\nDeposit an amount to your personal account: ");
        personalDeposit = scan.nextDouble();
        perAcct.deposit(personalDeposit);


        System.out.println("\nDeposit an amount to your business account: ");
        businessDeposit = scan.nextDouble();
        perAcct.deposit(businessDeposit);

        scan.close();

    }    
}
