import java.time.LocalDate;

public class BankAccount {
    private String accountType;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;
    private double overdraft;

//    constructor

    public BankAccount(String inputAccountType,  String inputFirstName, String inputLastName,
                       LocalDate inputDateOfBirth, int inputAccountNumber, double inputOverdraft){
        this.accountType = inputAccountType;
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0;
        this.overdraft = inputOverdraft;
    }

//    METHODS

    public void deposit(double deposit){
        this.balance += deposit;
    }

    public void withdraw(double withdrawal){
        double currentBalance = this.balance;
        if (this.balance - withdrawal < overdraft*-1){
            this.balance = overdraft * -1;
            System.out.println("Overdraft limit reached");
        }else{
            this.balance -= withdrawal;
        }

    }

    public void payInterest(){
        double currentAccountInterestRate = 0.2;
        double savingsAccountInterestRate = 0.5;
        double otherAccountInterestRate = 0.3;
        if (this.accountType.equals("current")){
            this.balance *= (1 + currentAccountInterestRate/100);
        } if (this.accountType.equals("savings")){
            this.balance *= (1 + savingsAccountInterestRate/100);
        } else{
            this.balance *= (1 + otherAccountInterestRate/100);
        }

    }

//    getters and setters
    public String getAccountType(){
        return this.accountType;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getOverdraft(){
        return this.overdraft;
    }

    public void setAccountType(String newAccountType){
        this.accountType = newAccountType;
    }
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    public void setDateOfBirth(LocalDate newDateOfBirth){
        this.dateOfBirth = newDateOfBirth;
    }
    public void setAccountNumber(int newAccountNumber){
        this.accountNumber = newAccountNumber;
    }
    public void setBalance(double newBalance){
        this.balance = newBalance;
    }
    public void setOverdraft(double newOverdraft){
        this.overdraft = newOverdraft;
    }




}
