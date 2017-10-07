/**
 * Created by danny on 7/10/2017.
 */
public class TwelveInts
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12};
        int i;
        for (i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
        for (i = nums.length - 1; i >= 0; i--)
            System.out.println(nums[i] + " ");
    }
}
