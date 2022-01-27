public class Duplication {
    public static void main(String[]args)
    {
        String str = "acssolutions";
        char str1[] = str.toCharArray();
        for(int i=0;i<str1.length;i++)
        {
            int count = 1;
            for(int j=i+1;j<str1.length;j++)
            {
                if (str1[i] == str1[j])
                {
                    count++;
                    str1[j] = '0'; //not to print the visited characters

                }
            }
            if(count>1 && str1[i]!='0')
            {
                System.out.println(str1[i]);// duplicate characters
            }

        }
    }
}
