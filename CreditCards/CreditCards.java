
/**
 * 
 *
 * @author ROBERTO GULISANO
 * @version1.0
 */
public class CreditCards
{
    
   private String cardNumber;
   private double balance;
   private double interestRate;
   
   public CreditCards(String CardNumber, int interestRate)
    {
    this.cardNumber = CardNumber;
    this.interestRate = interestRate;
    this.balance = 0.0;
    }
    
    public void recharge (double amount)
    {
        if (amount < 0)
        System.out.println("negative transaction" + amount);
            else 
            {
                balance += amount;
    }
    }
    
    public void payment (double amount)
    {
        if (amount <0)
        System.out.println("Negative transaction" + amount);
            else
        {
                balance -=amount;
        }
    }
    
    public void getBalnce()
    {
        System.out.println("Your Balance is " + balance);
    }
    
    public double getInterest()
    {
        return balance * interestRate;
        
    }
}
    

