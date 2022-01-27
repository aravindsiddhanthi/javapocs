public class SortedArray
{
    public static void main(String[] args)
    {
        // using binary approach
        int arr[] = {11,12,13,14,15,16};
        int n = arr.length;
        int low = 0, mid = 0, high = n-1;
        int value = 13;
        mid = low +(high-low)/2;

        while(low<=high)
        {
            if(arr[mid] == value)
            {
                System.out.println(value);//value to be printed
                //System.out.println(mid);
                break;
            }
            else if(arr[mid]<value)
            {
                low = mid+1;
            }
            else
            {
                high = mid - 1;
            }
            mid = (low+high)/2;
        }
    }
}
