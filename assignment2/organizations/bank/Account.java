package assignment2.organizations.bank;

import assignment2.commons.Person;
import java.util.Objects;
public class Account {
    private String accountNumber;
    private double balance;
    private Person owner;

    public Account(String accountNumber, double balance, Person owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Account)) {
            return false;
        }
        Account other = (Account) compared;
        return this.accountNumber.equals(other.accountNumber) && this.balance == other.balance &&
                this.owner.equals(other.owner);
    }
}
