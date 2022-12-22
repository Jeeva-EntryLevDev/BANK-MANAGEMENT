package package1;
import java.util.*;

public class Main 
{
	static int i=0;
	static String name,num,num2;
	static ArrayList<Create> ct=new ArrayList<Create>(); 
	//static Create ct[]=new Create[100];
	static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
	{
		while(true) 
		{
			System.out.println("1.CREAT NEW\n2.LOGIN");
			int m=sc.nextInt();
			if(m==1)
			{
				/*System.out.println("Enter your name :");
				name=sc.next();
				System.out.println("Enter your pnum :");
			    num=sc.next();*/
			    if(i!=0)
			    {
			        System.out.println(i);
			       // System.out.println("emandhitta kumaru");			    
			         int F=1;
			         System.out.println("Enter your name :");
				      name=sc.next();
				      System.out.println("Enter your pnum :");
			          num=sc.next();
			        for(Create s:ct)
			        {  
			            if(num.equals(s.num))
			            {
			                System.out.println("This number is already in account");
			                 F=0;
			                break;
			            }
			        }
			        if(F==1)
			        {
			          //  System.out.println("Indha number illa bha");
			           // Create obj1= new Create(name,num);
			          // obj1.set(name,num);
			           //ct.add(obj1);
			              ct.add(new Create(name,num));
			             // System.out.println("hiu");
			           //  ct.get(i).set(name,num);
			             i++;
			        }
			    }
			    else 
			    {
			          // System.out.println("Idhu new");
			           System.out.println("Enter your name :");
				       name=sc.next();
				       System.out.println("Enter your pnum :");
			           num=sc.next();
			          // Create obj= new Create(name,num);
			      //obj.set(name,num);
			        //   ct.add(obj);
			     //   ct.get(i).set(name,num); 
			       ct.add(new Create(name,num));
			       //set was a function in create class class ku nbame illama create panrom
				        i++;
			    }
			}
			else if(m==2)                    //LOG IN
			{
			    boolean f=true;             
			    System.out.println("Enter your num");
			    num2=sc.next();
			/*     for(Create s:ct)
			    {
			        System.out.println(s.num);
			        System.out.println(s.name);
			    }*/
			    for(Create s:ct)
			    {
			        if(num2.equals(s.num))
			        {
			            System.out.println("Welcome");
			            System.out.println("Your name is : ");
			            System.out.println(s.name);
			            Login l=new Login();
			            l.liblog(s,ct);
			            f=false;
			            break;
			        }
			    }
			    if(f)
			    {
			        System.out.println("There is no number in this ph num");
			    }
			}
			else 
			    System.out.println("Ebba olunga type pannu bha");
		}
				
	}
}



