import java.io.*;
import java.util.*;
class Tester
{
    public static void main(String args[])throws IOException
    {
        //Star ob=new Star(); //calls the constructor of class Star
        int count=0,count1=0,x,d=0;
        String acc="";
        Account[] bac=new Account[10];
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        do
        {
            x=0;
            char choice;
            if(d==0)
            {
                choice='N';
            }
            else
            {
                System.out.print("Do you have an account in our Bank(Enter Y(Yes) or N(No)):");
                choice=(char)in.read();
                System.out.println();
            }
            if(choice=='N' || choice=='n')
            {
                d=1;
                do
                {
                    count=0;//to terminate the loop
                    System.out.println("Which type of ACCOUNT do you want to create");
                    System.out.println("PRESS 1 for Savings Bank account");
                    System.out.println("PRESS 2 for Recurring Deposit account");
                    in.readLine();
                    String g=in.readLine();
                    if(g.equals("1"))
                    acc="savings bank account";
                    else if(g.equals("2"))
                    acc="recurring deposit account";
                    bac[count1]=new Account();
                    bac[count1].accountform(acc);
                    System.out.println("Do you want open another account,");
                    System.out.println("if yes(Y) else no(N)");
                    char ch=(char)in.read();
                    if(ch=='Y' || ch=='y')
                    {
                        count1++; //increments for each Account created
                        count++;//so as not to terminate the loop
                    }
                }while(count!=0);
            }
            System.out.println("Do you want to perform any operation(Y(yes) Or N(no)):");
            in.readLine();
            char ch1=(char)in.read();
            if(ch1=='Y' || ch1=='y')
            {
                System.out.println("Enter your code");
                in.readLine();
                String pass=in.readLine();
                for(int i=0;i<=count1;i++)//to check code
                {
                    if((bac[i].pass).equals(pass))
                    {
                        bac[i].details();
                        bac[i].operation();
                        x++;
                    }
                }
            }
            else
            {
                in.readLine();
                x++;
            }
        }while(x!=0);
    }
}
