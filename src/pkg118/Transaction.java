/*
 * Project: 11.8 Account class. 
 * Name: Lauren Smith 
 * Date: 11/18/20 
 * Class for a transactions of a bank account
*/
package pkg118;
import java.util.Date; 
public class Transaction {
  //declares and inits all vars 
    Date date; 
    char type='a'; 
    double amount=0.00; 
    double balance=0.00; 
    String description=""; 
    //constructor with parameters 
    public Transaction(char type, double amount, double balance, String description) 
    { 
        date=new Date(); 
        this.type=type; 
        this.amount=amount; 
        this.balance=balance; 
        this.description=description; 
    } 

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
