import java.util.Arrays;

public class Client{
    private int numberOfTransactions; /* total number of transactions to process */
    private int maxNbTransactions; /* maximum number of transactions */
    private Transactions[] transactions; /* transaction array */
    private String clientOperation; /* sending, receiving */
    private Network objNetwork; /* handle to access network methods */
    
    //Getters
    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }
    public String getClientOperation() {
        return clientOperation;
    }
    
    //Setters
    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }
    public void setClientOperation(String clientOperation) {
        this.clientOperation = clientOperation;
    }

    public void readTransactions(){
        //TODO: Implement
    }
    public void sendTransactions(){
        //TODO: Implement
    }
    public void recieveTransactions(Transactions transact){
        //TODO: Implement
    }
    
    @Override
    public String toString() {
        return "Client [numberOfTransactions=" + numberOfTransactions + ", maxNbTransactions=" + maxNbTransactions
                + ", transactions=" + Arrays.toString(transactions) + ", clientOperation=" + clientOperation
                + ", objNetwork=" + objNetwork + "]";
    }

    public void run(){
        //TODO: Implement
    }

    
}