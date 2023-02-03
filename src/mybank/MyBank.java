/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mybank;

/**
 *
 * @author peter
 */
public class MyBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create account
        Account myAccount = new Account("pete", 112, 98.99);
        Account myAccount2 = new Account("bob", 113, 65.00);
        
        //Add account to bank class
      
        System.out.println(myAccount.getName());
        System.out.println(myAccount.getBalance());
        myAccount.modify(450.00);
        System.out.println(myAccount.getBalance());
        
        Account.displayAccounts();
        Account.displayTotal();
       
    }
    
}
