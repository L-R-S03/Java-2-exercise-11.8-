/*
 * Project: 11.8 Account class. 
 * Name: Lauren Smith 
 * Date: 11/16/20 
 * Class for a bank account
*/
package pkg118;
import java.util.ArrayList;
import java.util.Date; 
public class Account  
{ 
    //makes ArrayaList for transactions 
    ArrayList transactions=new ArrayList(); 
    //declares all the private class vars 
    private int id; 
    private double balance; 
    private double annualInterestRate;
    private Date dateCreated; 
    private String name;     
    //default constructor that sets id,balance and annual interest to 0 
    
    public Account() 
    {
        id=0; 
        balance=0; 
        annualInterestRate=0;
        dateCreated=new Date(); 
    }
    
    //parameter constructor setting the three vars to specified values
    
    public Account(String name,int id, double balance, double annualInterestRate) 
    { 
        this.name=name; 
        this.id=id; 
        this.balance=balance; 
        this.annualInterestRate=annualInterestRate; 
        dateCreated=new Date(); 
    } 
    //parameter constructor with just name, id and balance
      public Account(String name,int id, double balance)
    { 
        this.name=name; 
        this.id=id; 
        this.balance=balance; 
        dateCreated=new Date(); 
    }
    
    //getters and setters for all vars 

    public ArrayList getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList transactions) {
        this.transactions = transactions;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
      
      public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public String getdateCreated() 
    {
        return dateCreated.toString(); 
    }
    
    //gets monthly interest by dividing annual by 12 
    //formats decimal using Math.round for toString method
    public Double getMonthlyInterestRate() 
    {
        double num=annualInterestRate/12; 
        num=Math.round(num*100.0)/10.0;
        return num; 
    } 
    
    public double getMonthlyInterest() 
    { 
        //makes monthly interest not a percent by dividing by 100
        double interest=getMonthlyInterestRate()/100;  
        //multiplies balance by the interest 
        return balance*interest; 
       
    } 
   
    //withdraws money from the account, subtracts withdrawn from num
    //adds a item to transactions with transaction type, amount and updated balance
    public void withdraw(double num) 
    {
        balance-=num; 
        transactions.add(new Transaction('W',num,balance,"withdrawal of $"+num)); 
    } 
    
    //deposits money in accout, adds deposit to balance 
    //adds a item to transactions with transaction type, amount and updated balance 
    public void deposit(double num) 
    {
        balance+=num; 
        transactions.add(new Transaction('D',num,balance,"deposited $"+num)); 
    } 
    
    public String toString() 
    {
        return("the account balance is "+ balance+" with a monthly interest of "
                + getMonthlyInterestRate()+"% and was created on "+getdateCreated()); 
        
                
    }
}

