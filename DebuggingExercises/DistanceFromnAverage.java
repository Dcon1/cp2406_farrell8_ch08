import java.util.Scanner;

/**
 * Created by danny on 7/10/2017.
 */
public class DistanceFromnAverage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] nums = new double[20];
        double userInput;
        double total = 0;
        double average = 0;
        int exit = 99999;
        int x = 0, y;
        System.out.println("Enter a number or enter 99999 to quit");
        userInput = input.nextDouble();
        while(userInput != exit && x < nums.length)
        {
            nums[x] = userInput;
            total += nums[x];
            ++x;
            if(x < nums.length)
            {
                System.out.println("Enter a number or enter 99999 to quit");
                userInput = input.nextDouble();
            }
        }
        if(x == 0)
            System.out.println("You did not enter a number");
        else {
            average = total / x;
            System.out.println("Average is = " + average);
            for (y = 0; y < x; ++y)
                System.out.println(nums[y] + " is " + (nums[y] - average) + " away from the average");
        }
    }
}
