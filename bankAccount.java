

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author risper
 */
class Account{


    private double balance;
    //construct empty bank account
    public Account()
            {
                balance = 0;
            }
    //initialize balance 
            public Account (double initialBalance){
                balance = initialBalance;
            }
            //deposit
            public void deposit(double amount)
            {
                balance =amount;
            }
            //wirtdrawal
            public void wirthdraw(double amountA)
            {
                balance=balance-amountA;
            }
            //balance
            public double getBalance()
            {
                return balance;
          }
}
//testing bank account
    public class bankAccount
    {
    public static void main(String[] args)
    {
        Account customerChecking = new Account();
        customerChecking.deposit(700);
        customerChecking.wirthdraw(10);
        System.out.println(customerChecking.getBalance());
        
        
    }
       
    }
      
        
        
        
        
        
        
   


 
    

