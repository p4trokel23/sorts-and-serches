import java.util.Calendar;

public class BubbleSort
{
    public static long main(String [] args)
    {
        int [] nums = new int[30];
        int [] nums2 = {2,57,8,129};
        
        for(int i=0; i<nums.length; i++) 
        {
            nums[i] = (int)(Math.random()*50+1);
             //System.out.println(nums[i]);
        }
        int count = 0;
        Calendar myCal = Calendar.getInstance();
        long start = myCal.getTimeInMillis();
        for(int j=0; j<nums.length; j++)
        {
            for(int i=0; i<(nums.length-1)-j; i++)
            {
                count++;
                if(nums[i]> nums[i+1])
                {
                    int temp = nums[i];
                    nums[i] = nums [i+1];
                    nums[i+1]= temp;
                }
            }
        }
        myCal = Calendar.getInstance();
        long end = myCal.getTimeInMillis();
         //System.out.println("Times through inner loop: "+count);
        //for (int i=0;i<nums.length;i++)
            //System.out.println(+nums[i]);
        
        // int big=0;
        // int bigIndex = -1;
        // for(int i=0; i<nums.length; i++)
        // {
            // if(big<nums[i])
            // {
                // big = nums[i];
                // bigIndex = i;
            // }  
        // }
        // System.out.println( "largest number is "+ big + " at line "+ bigIndex);
        
        // int temp = nums[bigIndex];
        // nums[bigIndex] = nums [nums.length-1];
        // nums[nums.length-1]= temp;
        
        return end-start;
    }
}

