package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    public void removeBankAccountByIndex(Integer indexNumber){

        Integer x = 0;
        for(BankAccount element : accounts){
            if(x == indexNumber){
                accounts.set(indexNumber , null);
                accounts.remove(null);
                break;
            }
            x++;
        }
    }

    public void addBankAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {

        if(accounts.contains(bankAccount)){
            return true;
        }else{
            return false;
        }

        //throw new UnsupportedOperationException("Method not yet implemented");
    }
}
