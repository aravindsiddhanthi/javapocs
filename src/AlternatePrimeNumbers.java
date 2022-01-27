public class AlternatePrimeNumbers
{
    public static void main(String[] args)
    {
        int num = 20;
        System.out.print("Alternate prime numbers up to " + num + " are: ");
        AlternatePrimeNumber(num);
    }
    static int prime(int num) // to check the number is prime or not
    {
        int flag = 0;
        for (int i = 2; i <= num / 2; i++)
        {
            if (num % i == 0)
            {
                flag = 1;
                break;
            }
        }
        if(flag==0)
        {
            return 1;
        }
        else
        {
            return  0;
        }
    }
    static void AlternatePrimeNumber(int n)// to print alternate primenumber
    {
        int temp = 2;
        for(int num = 2;num <= n-1;num++)
        {
            if(prime(num) ==1)
            {
                if(temp %2 ==0)
                    System.out.print(num + " ");
                temp++;
            }
        }
    }
}
