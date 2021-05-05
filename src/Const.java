public class Const {
    public static void main(String[] args) {
        System.out.println("Begin banking....");
        BankAccount ba1 = new BankAccount (12348,"Deepika",875439,7890,"Chennai");
        
        ba1.showBankAccountDetails();    
       
       
    } //ctrl +F11 short cut to run
}

class BankAccount {         
   private int bankAccountNumber;    
   private String bankAccountHolderName;
   private double bankAccountBalance;    
   private int bankAccountPinNumber; 
   private String bankAccountHolderAddress; 
    BankAccount (int a, String b, double c, int d, String e) {
        System.out.println("Setting bank Account details....");
        bankAccountNumber=a;   
        bankAccountHolderName=b; 
        bankAccountBalance=c;   
        bankAccountPinNumber=d;    
        bankAccountHolderAddress=e;
    }

void showBankAccountDetails() {
        System.out.println("Bank Account Number          : "+bankAccountNumber);
        System.out.println("Bank Account Holder          : "+bankAccountHolderName);
        System.out.println("Bank Account Balance         : "+bankAccountBalance);
        System.out.println("Bank Account Pin             : "+bankAccountPinNumber);
        System.out.println("Bank Account Holders Address : "+bankAccountHolderAddress);
        System.out.println("---------------------------------");
    }

void withdraw(double amt)
{
	if(amt < 0)
	{
		System.out.println("Cannot withdraw negative or 0 amount");
	}
	else if(amt > bankAccountBalance)
	{
		System.out.println("Cannot withdraw more than your balance");
	}
	else if(amt > bankAccountBalance - 500)
	{
		System.out.println("Minimum balance must be maintained");
	}
	else
	{
		System.out.println("Withdrawing " + amt);
		bankAccountBalance = bankAccountBalance - amt;
	}
}


    void deposit() { //member method OR funcionality service
        System.out.println(bankAccountHolderName +" is depositing...");
    }
    void changePin() { //member method
        System.out.println(bankAccountHolderName +" is chaning Pin...");
    }
    void changeAddress() { //member method
        System.out.println(bankAccountHolderName+" is changing Address...");
    }
}


