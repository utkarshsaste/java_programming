class Logic
{
    void printOddNumbers(int n)
    {
        for (int i = 1; i <= n; i += 2)
        {
            System.out.println(i);
        }
    }
}

class Program18_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}
