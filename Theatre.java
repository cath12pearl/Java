class Theatre
{
int price;

public static void main(String[] args)
{
Theatre raja = new Theatre();

int balance = raja.bookTicket(100);
System.out.println("After booking ticket Balance is " + balance);
}


int bookTicket(int cash)
{
int balance;
price = 120;
balance = cash - price;
System.out.println("Display Latest Theatre");
return balance;
}
}


