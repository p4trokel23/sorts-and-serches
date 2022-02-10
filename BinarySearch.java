import java.util.Scanner;

/**
 * Write a description of class binarySearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearch
{
    public static void main(String[]args)
    {
        int [] nums = InsertionSort.main(null);
        
        for (int n:nums)
            System.out.println(n);
            
        Scanner scan = new Scanner(System.in);
        System.out.print("What number should I find between 1 and 100?: ");
        int ans = scan.nextInt();
        
        int lowIndex = 0, highIndex = nums.length-1, midIndex = (lowIndex+highIndex)/2;
        
        while (lowIndex<highIndex && ans!=nums[midIndex])
        {
            if(ans>nums[midIndex])
                lowIndex = midIndex+1;
            if(ans<nums[midIndex])
                highIndex = midIndex-1;    
            
            midIndex=(lowIndex+highIndex)/2;
            
        }
        if(ans==nums[midIndex])
            System.out.println("the number "+ans +" is found at index "+ midIndex +" out of 70");
            
        else System.out.println("your number is not in the list");
    }
}
