public class Transactions {
    private String accountNumber;
    private String operationType; /* deposit, withdrawal, query */
    private double transactionAmount; /* transaction amount */
    private double transactionBalance; /* updated account balance */
    private String transactionError;  /* NSF, invalid amount or account, none */
    private String transactionStatus; /* pending, sent, received, done */
    
    //Constructor
    public Transactions(String accountNumber, String operationType, double transactionAmount, double transactionBalance,
            String transactionError, String transactionStatus) {
        this.accountNumber = accountNumber;
        this.operationType = operationType;
        this.transactionAmount = transactionAmount;
        this.transactionBalance = transactionBalance;
        this.transactionError = transactionError;
        this.transactionStatus = transactionStatus;
    }
    // Setters & Getters
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getOperationType() {
        return operationType;
    }
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
    public double getTransactionAmount() {
        return transactionAmount;
    }
    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
    public double getTransactionBalance() {
        return transactionBalance;
    }
    public void setTransactionBalance(double transactionBalance) {
        this.transactionBalance = transactionBalance;
    }
    public String getTransactionError() {
        return transactionError;
    }
    public void setTransactionError(String transactionError) {
        this.transactionError = transactionError;
    }
    public String getTransactionStatus() {
        return transactionStatus;
    }
    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
    
    @Override
    public String toString() {
        return "Transactions [accountNumber=" + accountNumber + ", operationType=" + operationType
                + ", transactionAmount=" + transactionAmount + ", transactionBalance=" + transactionBalance
                + ", transactionError=" + transactionError + ", transactionStatus=" + transactionStatus + "]";
    }
}   
