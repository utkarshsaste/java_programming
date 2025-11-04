class Logic
{
    void printDigits(int num)
    {
        int digit;
        
        System.out.println("Digits of the number are:");
        while(num > 0)
        {
            digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }
}

class Program19_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}
