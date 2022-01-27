public class Armstrong {
    public static void main(String[]args)
    {
        int n = 371, originalnumber,remainder,result=0;
        originalnumber = n;
        while(originalnumber!=0)
        {
            remainder = originalnumber%10;//1 7 3
            result = (int) (result+ Math.pow(remainder,3));//1 343 27 = 371
            originalnumber = originalnumber/10;//37 3
        }
        if(result==n)
        {
            System.out.println(n +" is a armstrong number");
        }
        else
        {
            System.out.println(n +" is  not a armstrong number");
        }
    }
}
