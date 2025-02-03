public class Account {
    private String accountNumber; //Must be unique
    private String accountType;
    private String firstName;
    private String lastName;
    private double balance;

    //Constructor
    public Account(String accountNumber, String accountType, String firstName, String lastName, double balance){
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    // Getters
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public String getAccountType(){
        return this.accountType;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public double getBalance(){
        return this.balance;
    }
    //Setters
    public void setAccountNumber(String accNumber){
        this.accountNumber = accNumber;
    }
    public void setAccountType(String accType){
        this.accountType = accType;
    }
    public void setFirstName(String fName){
        this.firstName = fName;
    }
    public void setLastname(String lName){
        this.lastName = lName;
    }
    public void setBalance(double bal){
        this.balance = bal;
    }
    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", firstName=" + firstName
                + ", lastName=" + lastName + ", balance=" + balance + "]";
    }
    
}
