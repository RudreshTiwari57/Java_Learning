package exercise;

//🔹 Problem:   Create an abstract class BankAccount with a constructor to
//              initialize accountNumber. Implement a subclass SavingsAccount
//              that prints the account number.




abstract class bankaccount
{
    int accountnumber;
    bankaccount(int accountnumber)
    {
        this.accountnumber = accountnumber;
    }
}

class savingsaccount extends bankaccount
{
    savingsaccount(int accountnumber)
    {
        super(accountnumber);
    }
    void getaccountdetails(long accountbalance)
    {
        System.out.println("account number: "+ accountnumber);
        System.out.println("balance: "+ accountbalance);
    }
}
public class bank_abstract {

    public static void main(String[] args) {

        savingsaccount savingsacco = new savingsaccount(12342);
        savingsacco.getaccountdetails(213242);


    }
}
