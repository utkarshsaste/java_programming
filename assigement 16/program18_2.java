class Logic
{
    void printEvenNumbers(int n)
    {
        for (int i = 2; i <= n; i += 2)
        {
            System.out.println(i);
        }
    }
}

class Program18_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}
