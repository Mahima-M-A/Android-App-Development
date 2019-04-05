import java.io.*;
import java .util.*;
class Account
{
    public int count1=0,count2=0,count3=0;
    public int a,ch;
    public String pass;
    public String name;
    public int age;
    public String father;
    public String mother;
    public String gaurd;
    public String gen;
    public String p_add;
    public String l_add;
    public String nation;
    public String dob;
    public String con_no;
    public String id;
    public String acc;
    public double rate;
    public double deposit;
    public double withdrawal;
    public double[] amount=new double[100];
    String[] date1=new String[100];
    double[] dep=new double[100];
    double[] with=new double[100];
    double[] bal=new double[12];
    double balance,interest;
    public void accountform(String a)throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int z=0;
        if(a.equals("saving bank account"))
            ch=1;
        if(a.equals("recurring deposit account"))
            ch=2;

        System.out.println("Fill in the following details for your "+a+":");
        System.out.print("NAME:");
        name=in.readLine();
        System.out.println();

        z=0;
        do
        {
            z=0;
            try
            {
                System.out.print("Age:");
                age=Integer.parseInt(in.readLine());
                if(age<18)
                {
                    System.out.println("Candidate below 18yrs is 'Not Eligible' to have an Account in this Bank");
                    z=1;
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("Error!");
                z=1;
                System.out.println();
            }
        }while(z!=0);
        System.out.println();

        int count=0;
        int d1=0;
        do
        {
            count=0;
            d1=0;
            acc=a;
            System.out.println("Enter the Date of birth in the format:(dd/mm/yyyy)");
            System.out.print("D.O.B.:");
            dob=in.readLine();
            if(dob.length()==10)
            {
                for(int i=0;i<dob.length();i++)
                {
                    char ch=dob.charAt(i);
                    if(i!=2&&i!=5)
                    {
                        if(Character.isDigit(ch))
                            continue;
                        else
                            count++;
                    }
                    if(i==2||i==5)
                    {
                        if(ch=='/')
                            continue;
                        else
                        {
                            count++;
                            System.out.println("Error!");
                            d1=1;
                            System.out.println();
                        }
                    }
                }
                if((2015-Integer.valueOf(dob.substring(6,dob.length())))==age);
                else
                {
                    System.out.println("ERROR in Date of Birth");d1=1;
                }
                if(Integer.valueOf(dob.substring(0,2))<=31);
                else
                {
                    System.out.println("ERROR in Date of Birth");d1=1;
                }
                if(Integer.valueOf(dob.substring(3,5))<=12);
                else
                {
                    System.out.println("ERROR in Date of Birth");d1=1;
                }
            }
            else
            {
                System.out.println("Error!");
                d1=1;
            }
        }while(count!=0||d1!=0);
        System.out.println();

        System.out.print("Father's Name:");
        father=in.readLine();
        System.out.println();

        System.out.print("Mother's Name:");
        mother=in.readLine();
        System.out.println();

        System.out.print("Gaurdian's Name:");
        gaurd=in.readLine();
        System.out.println();

        int na=0;
        do
        {
            na=0;
            System.out.print("Nationality:");
            nation=in.readLine();
            if(nation.equalsIgnoreCase("INDIAN") || nation.equalsIgnoreCase("INDIA"))
                System.out.println();
            else
            {
                System.out.println("ONLY INDIANS are 'Eligible' to have an Account in this Bank");
                na=1;
                System.out.println();
            }
        }while(na!=0);

        System.out.print("Gender(ENTER:Female OR Male):");
        gen=in.readLine();
        System.out.println();

        System.out.print("Permanent Address:");
        p_add=in.readLine();
        System.out.println();

        System.out.print("Local Address:");
        l_add=in.readLine();
        System.out.println();

        int cn1=0;
        do
        {
            cn1=0;
            System.out.print("Contact No.:");
            con_no=in.readLine();
            if(con_no.length()!=10)
            {
                System.out.println("Invalid Number");
                cn1=1;
                System.out.println();
            }
            for(int i=0;i<con_no.length();i++)
            {
                char ch=con_no.charAt(i);
                if(Character.isDigit(ch));
                else
                {
                    System.out.println("Invalid Number");
                    cn1=1;
                    System.out.println();
                }
            }
        }while(cn1!=0);
        System.out.println();

        System.out.print("E-mail ID:");
        id=in.readLine();
        System.out.println();

        System.out.println("Your LOGIN ID to this account is:"+Generate_password());
        System.out.println();
    }

    public String Generate_password()
    {
        double x=Math.random()*(9999-1000)+1000;
        int a=(int)x;
        pass=String.valueOf(a);
        return(pass);
    }

    public void details()
    {
        if(acc.equals("savings bank account"))
            System.out.println("Your Details of Savings bank account:");
        else if(acc.equals("recurring deposit account"))
            System.out.println("Your Details of Recurring deposit account:");
        System.out.println("NAME:"+name);
        System.out.println("AGE:"+age);
        System.out.println("FATHER'S NAME:"+father);
        System.out.println("MOTHER'S NAME:"+mother);
        System.out.println("GUARDIAN'S NAME:"+gaurd);
        System.out.println("NATIONALITY:"+nation);
        System.out.println("GENDER:"+gen);
        System.out.println("PERMANENT ADDRESS:"+p_add);
        System.out.println("LOCAL ADDRESS:"+l_add);
        System.out.println("DATE OF BIRTH:"+dob);
        System.out.println("CONTACT No."+con_no);
        System.out.println("E-Mail ID:"+id);
        System.out.println();

        if(acc.equals("savings bank account"))
        {
            balance=bal[11]+interest;
            System.out.println("BALANCE AMOUNT in your ACCOUNT:Rs."+balance);
        }
    }

    public void operation()
    {
        if(acc.equals("savings bank account"))
            savings_bank_account();
        if(acc.equals("recurring deposit account"))
            recurring_deposit_account();
    }

    public void selection()
    {
        int count;
        do
        {
            count=0;
            Scanner in=new Scanner(System.in);
            System.out.println("Which operation do you want to perform:");
            System.out.println("ENTER:1 for Deposit");
            System.out.println("ENTER:2 for Withdrawal");
            int select=in.nextInt();
            int y=0;
            do
            {
            switch(select)
            {
                case 1: deposit();
                    count1++;
                break;
                case 2: withdrawal();
                    count1++;
                break;
                default: y=1;
                System.out.println("Invalid choice!");
            }
            }while(y!=0);
            System.out.println("Do you want to perform any operation (press Y(yes) or N(no) for depositing OR withdrawing)");
            in.nextLine();
            String ch=in.nextLine();
            if(ch.equalsIgnoreCase("Y"))
            {
                count++;
            }
            if(ch.equalsIgnoreCase("N"))
            {
                System.out.println("Transactions made are in this format:");
                System.out.println("   DATE     - DEPOSIT - WITHDRAWAL - BALANCE");
                for(int i=0;i<count1;i++)
                {
                    System.out.println(date1[i]+" - " +dep[i]+" - "+with[i]+" - "+amount[i]);
                }
                interest1();
                double principle=0;
                System.out.println("The Monthly minimum qualifying AMOUNT:");
                String MONTHS[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTMBER",
                "OCTOBER","NOVEMBER","DECEMBER"};
                for(int i=0;i<12;i++)
                {
                    System.out.println(MONTHS[i]+" - "+bal[i]);
                    principle+=bal[i];
                }

                System.out.println("PRINCIPLE AMOUNT:Rs."+principle);
                interest=(principle*rate*1/12);
                System.out.println();
                System.out.println("INTEREST you recieve:Rs."+interest);
                System.out.println();
            }
        }while(count!=0);
    }

    public void savings_bank_account()
    {
        rate();
        selection();
    }

    public void recurring_deposit_account()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the amount to be Deposited:");
        double MD=in.nextDouble();
        System.out.println("Enter the Time Period(in months):");
        double mon=in.nextDouble();
        rate();
        double t=(mon*(mon+1))/(2*12);
        double si=(MD*rate*t);
        System.out.println("AMOUNT of INTEREST you'll receive at the end of "+mon+" month(s) is=Rs."+si);
        System.out.println();
        double MV=(mon*MD)+si;
        System.out.println("MATURITY VALUE you'll receive at the end of "+mon+" month(s) is=Rs."+MV);
    }

    public void rate()
    {
        if(acc.equals("savings bank account"))
        {
            rate=0.06;
            System.out.println("Rate of Interest=6%");
        }
        if(acc.equals("recurring deposit account"))
        {
            rate=0.10;
            System.out.println("Rate of Interest=10%");
        }
    }

    public void deposit()
    {
        Scanner in=new Scanner(System.in);
        date_dep();
        System.out.println("Enter the amount to be Deposited:");
        dep[count1]=in.nextDouble();
        if(count3!=0)
        {
            amount[count3]=amount[(count3-1)]+dep[count1];
            count3++;
        }
        else
        {
            amount[count3]+=dep[count1];
            count3++;
        }
    }

    public void withdrawal()
    {
        Scanner in=new Scanner(System.in);
        date_dep();
        System.out.println("Enter the amount to be withdrawn:");
        with[count1]=in.nextDouble();
        int q=0;
        do
        {
            if(with[count1]>amount[0])
            {
                System.out.println("No balance!!!!");
                
            }
            else if(with[count1]<amount[(count3-1)])
            {
                amount[count3]=amount[(count3-1)]-with[count1];
                count3++;
            }
            else
            {
                System.out.println("Not enough balance!!!!");
                q=1;
            }
        }while(q!=0);
    }

    public void date_dep()
    {
        int count;
        do
        {
            count=0;
            Scanner in =new Scanner(System.in);
            System.out.println("enter the date of operation only in this format dd/mm/yyyy");
            date1[count1]=in.nextLine();
            String ch1=date1[count1];
            for(int i=0;i<date1[count1].length();i++)
            {
                char ch=ch1.charAt(i);

                if(i!=2&&i!=5)
                {
                    if(Character.isDigit(ch));
                    else
                    {
                        count++;
                    }
                }

                if(i==2||i==5)
                {
                    if(ch=='/');
                    else
                    {
                        count++;
                    }
                }

                if(Integer.valueOf(ch1.substring(0,2))<=31)
                {
                    if(Integer.valueOf(ch1.substring(3,5))<=12);
                    else
                    {
                       count++;
                    }
                }
                else
                {
                    count++;
                }
            }
        }while(count!=0);
        System.out.println();
    }

    public void interest1()
    {
        int c=0,k;
        String ch1;
        for(int i=0;i<count1;i++)
        {
            ch1=date1[i];
            if(Integer.valueOf(ch1.substring(3,5))==(c+1))
            {
                if(Integer.valueOf(ch1.substring(0,2))<=10 || amount[i-1]>amount[i])
                {
                    bal[c]=amount[i];
                }
                else
                {
                    bal[c]=amount[i-1];
                }
            }
            else
            {
                c++;
                i--;
            }
        }
    }
}
