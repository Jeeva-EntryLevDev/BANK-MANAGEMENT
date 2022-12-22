package package1;
import java.util.*;

class Transfer
{
    Scanner sc=new Scanner(System.in);
    static String ph,n;
    static int r,F=1;
    void transfer(Create s,ArrayList<Create>ct)
    {
        while(true)
        {
            System.out.println("Tell the ph no   :  ");
            ph=sc.next();
            if(ph.equals(s.num))
            {
                 System.out.println("SELF TRANSACTION WAS NOT ALLOWED");
            }
            else
            {
                for(Create m:ct)
                {
                    if(ph.equals(m.num))
                    {
                        System.out.println("Details of receiver");
                        System.out.printf("Name : %s\n",m.name);
                        System.out.println("Enter the amount : ");
                        r=sc.nextInt();
                        if(r<=s.sa)
                        {
                            
                            m.sa=m.sa+r;
                            s.sa=s.sa-r;
                            System.out.println("Successfully transferred");
                            System.out.println("Your balance is : ");
                            System.out.println(s.sa);
                            F=0;              //number kandupudichiten
                            break;
                        }
                        else  
                        {
                            System.out.println("Your account doesn't has money which you want");
                            System.out.printf("Balance is : %d",s.sa);
                            F=0;
                            break;
                        }
                    }
                }
                if(F==1)
                {
                    System.out.println("There is no such number");
                }
                else
                	break;
            }
        }
    }
}