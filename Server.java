import java.util.Arrays;

public class Server {
    private int numberOfTransactions; /* total number of transactions received */
    private int numberOfAccounts; /* total number of accounts saved */
    private int maxNbAccounts; /* maximum number of accounts */
    private Transactions transaction; /* a transaction to process */
    private Network objNetwork; /* handle to access network methods */
    private Account[] account;
    
    
    public Server(int numberOfTransactions, int numberOfAccounts, int maxNbAccounts, Transactions transaction, Network objNetwork, Account[] account) {
        this.numberOfTransactions = numberOfTransactions;
        this.numberOfAccounts = numberOfAccounts;
        this.maxNbAccounts = maxNbAccounts;
        this.transaction = transaction;
        this.objNetwork = objNetwork;
        this.account = account;
    }
    //Setters & Getters
    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }
    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }
    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }
    public void setNumberOfAccounts(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }
    public int getMaxNbAccounts() {
        return maxNbAccounts;
    }
    public void setMaxNbAccounts(int maxNbAccounts) {
        this.maxNbAccounts = maxNbAccounts;
    }

    public void initializeAccounts(){
        //TODO: 
    }
    public int findAccount(String accNumber){
        //TODO:
        return 0;
    }
    public boolean processTransactions(Transactions trans){
        //TODO: 
        return false;
    }
    public double deposit(int i, double amount){
        //TODO:
        return 0;
    }
    public double withdraw(int i, double amount){
        //TODO:
        return 0;
    }
    public double query(int i){
        //TODO:
        return 0;
    }
    @Override
    public String toString() {
        return "Server [numberOfTransactions=" + numberOfTransactions + ", numberOfAccounts=" + numberOfAccounts
                + ", maxNbAccounts=" + maxNbAccounts + ", transaction=" + transaction + ", objNetwork=" + objNetwork
                + ", account=" + Arrays.toString(account) + "]";
    }
    

    public void run(){
        //TODO: 
    }
}
