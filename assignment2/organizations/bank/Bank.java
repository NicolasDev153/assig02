package assignment2.organizations.bank;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;
import assignment2.commons.Person;

import java.util.ArrayList;
import java.util.List;

/*
 * The Bank class contains a list of bank accounts and methods to manage those accounts.
 */
public class Bank extends Organization implements Contactable {
    private String email;
    private String address;
    private String phoneNumber;
    private List<Account> accounts = new ArrayList<>();

    // constructor
    public Bank(String name, String description) {
        this.setName(name);
        this.setDescription(description);
    }

    // add or remove accounts to the accounts list
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public boolean removeAccount(Account account) {
            boolean removed = false;
            if(accounts.contains(account)){
                accounts.remove(account);
                removed = true;
            }
            return removed;
        }

    // setters and getters of the defined variables
    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}