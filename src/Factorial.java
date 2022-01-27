public class Factorial
{
    //using recursion
    static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return  (n *fact(n-1));
        }
    }
    public static void main(String[]args)
    {
        int factorial = 1;
        int n = 5;
        factorial = fact(5);
        System.out.println("Factorial of " + n  + " is " + factorial);
    }
}

//without Recursion
/*class Factorial
{
    public static void main(String[] args)
    {
        int f = 1;
        int n = 5;
        for(int i=0;i<=n;i++)
        {
            f = f*i;
        }
        System.out.println("Factorial of "+ n + " is "+f);
    }
}*/