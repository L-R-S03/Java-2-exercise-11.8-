/*
 * Project: 11.8 Account class. 
 * Name: Lauren Smith 
 * Date: 11/18/20 
 * Tests bank account and transactions 
*/
package pkg118;


public class Main {

    public static void main(String[] args) {
        //makes new account with specified parameters 
        Account a =new Account("George",1122, 1000,1.5); 
        //deposits money three times
        a.deposit(30); 
        a.deposit(40); 
        a.deposit(50); 
        //withdraws money three times 
        a.withdraw(5); 
        a.withdraw(4); 
        a.withdraw(2);
        //prints information through ToString Method 
        System.out.println("Account holder is "+a.getName()+" "+a.toString()); 
        java.util.ArrayList list=a.getTransactions(); 
        //prints out transaction details using a for loop for each item in list
        for(int i=0; i<list.size(); i++)
        {
            Transaction t=(Transaction) list.get(i); 
            System.out.println(t.getType()+" "+t.getAmount()+" "+t.getBalance());
        }
        
    }
    
}
