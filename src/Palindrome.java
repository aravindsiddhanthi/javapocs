public class Palindrome {
public static void main(String[]args )
{
    int n = 343;
    int temp, sum = 0, remainder;
    temp = n;
    while(n>0)
    {
        remainder = n%10;
        sum = (sum*10) + remainder;//343
        n = n/10;
    }
    if(temp==sum)
    {
        System.out.println("the number is palindrome");
    }
    else
    {
        System.out.println("the number is  not palindrome");
    }
}
}
