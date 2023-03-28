import java.time.LocalDate;

public class BankAccount {
    private String accountType;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;

//    constructor

    public BankAccount(String inputAccountType,  String inputFirstName, String inputLastName, LocalDate inputDateOfBirth, int inputAccountNumber){
        this.accountType = inputAccountType;
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0;
    }

//    methods

    public void deposit(double deposit){
        this.balance += deposit;
    }

    public void withdrawal(double withdrawal){
        this.balance -= withdrawal;
    }

    public void payInterest(){
        double currentAccountInterestRate = 0.2;
        double savingsAccountInterestRate = 0.5;
        if (this.accountType.equals("current")){
            this.balance *= (1 + currentAccountInterestRate/100);
        } if (this.accountType.equals("savings")){
            this.balance *= (1 + savingsAccountInterestRate/100);
        }

    }

//    getters and setters
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

}
