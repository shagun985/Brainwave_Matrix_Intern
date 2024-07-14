import java.util.Scanner;
public class ATMinterface  
{  
    //main method    
    public static void main(String args[] )  
    {  
     
        int balance = 10000, withdraw, deposit;  
          
        Scanner obj = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine: ");  
            System.out.println("Choose_1 for Withdrawing the Money");  
            System.out.println("Choose_2 for making a Deposit");  
            System.out.println("Choose_3 for Checking your Balance");  
            System.out.println("Choose_4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            int choice = obj.nextInt();
			
            switch(choice)  
            {  
                case 1:  
					System.out.print("Enter money to be withdrawn:");  
                      
         
					withdraw = obj.nextInt();  
                      
          
					if(balance >= withdraw)  
					{  
            
					balance = balance - withdraw;  
					System.out.println("Please collect your money");  
					}  
					else  
					{  
						System.out.println("Insufficient Balance");  
					}  
					System.out.println("");  
					break;  
   
                case 2:  
                      
					System.out.print("Enter money to be deposited:");  
          
					deposit = obj.nextInt();  

					balance = balance + deposit;  
					System.out.println("Your Money has been successfully deposited");  
					System.out.println("");  
					break;  
   
                case 3:
					System.out.println("Balance : "+balance);  
					System.out.println("");  
					break;  
   
                case 4:    
					System.exit(0);  
            }  
        }  
    }  
}  