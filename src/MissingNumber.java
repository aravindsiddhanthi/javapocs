public class MissingNumber
{
    public static void main(String args[])
    {
        int a[] = {1,2,4,5};

        int sum1 = 0;
        for(int i=0;i< a.length;i++)
        {
            sum1 = sum1 + a[i];
        }
        System.out.println("Sum of elements in array : " + sum1);//sum of values in array

        int sum2 = 0;
        for(int i=1;i<=5;i++)
        {
            sum2 = sum2 + i;
        }
        System.out.println("sum of elements in array: " + sum2);//sum of values in range

        System.out.println("Missing number is: x" + (sum2-sum1)); // missing number
    }
}
