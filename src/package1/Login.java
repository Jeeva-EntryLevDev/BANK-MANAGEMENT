package package1;
import java.util.*;

class Login
{
    Scanner sc=new Scanner(System.in);
    static int de,w;
    void liblog(Create s,ArrayList<Create>ct)
    
	{
	    while(true)
	    {
	        int k;
	        System.out.println("1.DEPOSIT");
	        System.out.println("2.BALANCE");
	        System.out.println("3.WITHDRAW");
	        System.out.println("4.TRANSFER");
	        System.out.println("5.LOG OUT");
	        k=sc.nextInt();
	        if(k==1)
	        {
	            System.out.println("Enter the amount of deposit");
	            de=sc.nextInt();
	            s.sa=s.sa+de;
	            System.out.println(s.sa);
	            
	        }
	        else if(k==2)
	        {
	            System.out.println("Your balance ");
	            System.out.println(s.sa);
	        }
	        else if(k==3)
	        {
	            if(s.sa>100)
	            {
	                System.out.println("Enter the amount to be withdraw");
	                w=sc.nextInt();
	                if(w<=s.sa)
	                {
	                    s.sa=s.sa-w;
	                    System.out.println("Thank you");
	                    System.out.println("Your balance : ");
	                    System.out.println(s.sa);
	                }
	                else
	                {
	                    System.out.println("your withdrawn amount was higher than balance");
	                }
	
	            }
	            else 
	            {
	                System.out.println("your account has less than 100 rs");
	                System.out.print("Your amount is ");
	                System.out.println(s.sa);
	                
	            }
	        }
	        else if(k==4)
	        {
	            Transfer j=new Transfer();
	            j.transfer(s,ct);
	        }
	        else if(k==5)
	        {
	            System.out.println("Logged out");
	            break;
	        }
	        else
	            System.out.println("Ebba olunga type pannu pa");
	    }
	}
}

