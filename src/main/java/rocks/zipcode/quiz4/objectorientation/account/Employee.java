package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Transactable , Worker{

    BankAccount bankAccount;
    Double hoursWorked;
    Double hourlyWage;

    public Employee() {
        this.bankAccount = new BankAccount();
        this.hoursWorked = 0.0;
        this.hourlyWage = 35.0;
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.hoursWorked = 0.0;
        this.hourlyWage = 35.0;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    // *********************************************   TRANSACTABLE METHODS   ****************
    @Override
    public void deposit(Double amountToIncreaseBy) {

        if(amountToIncreaseBy < 0){
            throw new java.lang.IllegalArgumentException();
        }else{
            this.bankAccount.setBalance(this.bankAccount.getBalance() + amountToIncreaseBy);
        }

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {

        if(amountToDecreaseBy < 0 || this.bankAccount.getBalance() < amountToDecreaseBy){
            throw new java.lang.IllegalArgumentException();
        }else{
            this.bankAccount.setBalance(this.bankAccount.getBalance() - amountToDecreaseBy);
        }

    }
    @Override
    public Double getBalance() {
        return this.bankAccount.getBalance();
    }


    // ***************************************************   WORKER METHODS   **************

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.hoursWorked += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return this.hoursWorked * this.hourlyWage;
    }
}
