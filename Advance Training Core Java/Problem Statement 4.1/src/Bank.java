
public class Bank {
	int accountNumber;
    String name;
    String accountType;
    double balance;
   
    public int getAccountNumber() {
        return accountNumber;
    }
   
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
   
    public String getName() {
        return name;
    }
   
    public void setName(String name) {
        this.name = name;
    }
   
    public String getAccountType() {
        return accountType;
    }
   
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
   
    public double getBalance() {
       
        if( balance <1000)
        {
        try
        {   
            throw new NumberFormatException();
        }
        catch(NumberFormatException a)
        {
            System.out.println("Balance is low"+balance);
        }
        }
       
       
        return balance;
       
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Bank() {
       
        this.accountNumber = 46470;
        this.name = "ACH2";
        this.accountType = "Saving";
        this.balance = 700;
    }
   
   
   
   
    public Bank(int account_number, String name, String account_type,
            double balance) {
       
        this.accountNumber = accountNumber;
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
    }
    void deposit(double amt)
    {
        if(amt<0)
        {
            try
            {
                throw new NumberFormatException();
            }
            catch(NumberFormatException g)
            {
                System.out.println("Negative Amount cant be deposited");
            }
        }
        else
        {
            balance=getBalance()+amt;
            System.out.println("Current balance is ="+balance);
           
        }
       
       
       
    }
     public void withdraw(double amt){
         if(amt>1000)
            {
                try
                {
                    throw new NumberFormatException();
                }
                catch(NumberFormatException g)
                {
                    System.out.println("WE CANT DEPOSITE AMOUNT INSUFFICENT BALANCE ");
                }
            }
            else
            {
                balance=getBalance()-amt;
                System.out.println("Current balance is ="+balance);
               
            }
       
       
       
       
       
    }
     void display()
     {
    System.out.println("Balance is ="+getBalance());   
     }
   
   
   
   
    public static void main(String[] args) {
       
       
        Bank b=new Bank();
        b.deposit(2000);
        b.display();
        b.withdraw(500);
        b.display();
        b.withdraw(2000);
        b.getBalance();
        b.display();
       
       
       
    }
   
}
