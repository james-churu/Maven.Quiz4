package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    Double balance;

    public BankAccount(){
        balance = 0.00;
    }

    public void setBalance(Double val) {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {

        if(amountToIncreaseBy < 0){
            throw new java.lang.IllegalArgumentException();
        }else{
            this.balance = balance + amountToIncreaseBy;
        }

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {

        if(amountToDecreaseBy < 0 || this.balance < amountToDecreaseBy){
            throw new java.lang.IllegalArgumentException();
        }else{
            this.balance = balance - amountToDecreaseBy;
        }

    }

    @Override
    public Double getBalance() {
        return this.balance;
    }
}
