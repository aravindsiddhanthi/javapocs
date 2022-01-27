public class ReversePrime
{
    public static void main(String[]args)
    {
        int range = 10;
        for(int i=10;i>=2;i--)
        {
            int count = 0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count = count+1;
                }
            }
            if(count<=2)
            {
                System.out.print(" "+ i);
            }
        }
    }
}
