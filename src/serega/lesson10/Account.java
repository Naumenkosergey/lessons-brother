package serega.lesson10;

import java.util.Objects;

public class Account {

     private int id;
     private double balance;

    public  Account(){}

    public  Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }

    public void showInfo(){
        System.out.println("баланс счета " + id + "=" + balance);
    }

    public void updateBalance(int i) {
        balance += i;
    }

    public void setBalance(int balance) {
        if(balance > 0) {
            this.balance = balance;}
        else {
            System.out.println("Иди в жопу хакер");
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && balance == account.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance);
    }
}

//ИНКАПСУЛЯЦИЯ
//4 мадификатора доступа
//public
//protected
//package (default)
//private