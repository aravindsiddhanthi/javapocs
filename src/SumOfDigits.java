public class SumOfDigits
{
    static void digits(int i,int num)
    {
        int sum=0, rem;
        int temp=i,k=i;
        while(k>0)
        {
            rem=k%10;
            sum=sum+rem;
            k=k/10;
        }
        if(sum==num)
        {
            System.out.println(temp);
        }
    }
    public static void main(String[] args)
    {
        int range=30,sum=0,rem,num=8;
        for(int i=30;i>0;i--)
        {
            digits(i,num);
        }
    }
}
